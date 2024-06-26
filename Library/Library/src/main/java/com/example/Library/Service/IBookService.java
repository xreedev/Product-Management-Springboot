package com.example.Library.Service;

import com.example.Library.Model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();
    Book getBookById(Integer id);
    Book createBook(Book book);
    Book updateBook(Integer id, Book book);
    void deleteBook(Integer id);
}
