package com.security.demo.service;

import com.security.demo.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    List<Book> getAllBooks();
}
