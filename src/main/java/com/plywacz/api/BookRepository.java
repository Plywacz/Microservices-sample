package com.plywacz.api;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
class BookRepository {
    Collection<Book> allBooks() {
        return List.of(
                new Book("Book1", "Author1"),
                new Book("Book2", "Author2"),
                new Book("Book3", "Author3"),
                new Book("Book4", "Author4")
        );
    }
}
