package com.plywacz.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient("${apiMicroserviceName}")
interface FeignBookClient {
    @GetMapping("/books")
    Collection<Book> fetchAllBooks();
}
