package com.plywacz.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Collection;

@Service
@RequiredArgsConstructor
class BookService {
    private final BookRepository bookRepository;

    Collection<Book> allBooks() {
        return bookRepository.allBooks();
    }
}
