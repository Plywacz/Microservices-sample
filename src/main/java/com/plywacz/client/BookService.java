package com.plywacz.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final FeignBookClient bookClient;

    @Value("${apiMicroserviceName}")
    private String apiMicroserviceName;

    Collection<ExtendedBook> allBooks() {
        return bookClient.fetchAllBooks()
                .stream()
                .map(this::extend)
                .collect(Collectors.toList());
    }

    private ExtendedBook extend(Book book) {
        return new ExtendedBook(book, generateData());
    }

    private static String generateData() {
        return "" + new Random().nextLong(1000000);
    }
}
