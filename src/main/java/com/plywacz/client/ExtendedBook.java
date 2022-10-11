package com.plywacz.client;

record ExtendedBook(Book core, String additionalInfo) {
}

record Book(String name, String author) {
}
