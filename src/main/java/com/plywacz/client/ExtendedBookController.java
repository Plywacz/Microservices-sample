package com.plywacz.client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("extendedBooks")
@RequiredArgsConstructor
class ExtendedBookController {
    private final BookService bookService;

    @GetMapping
    Collection<ExtendedBook> allExtendedBooks() {
        return bookService.allBooks();
    }
}
