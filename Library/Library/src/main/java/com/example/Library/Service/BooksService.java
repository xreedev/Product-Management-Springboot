package com.example.Library.Service;

import com.example.Library.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService implements IBookService {
    private final List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(Integer bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public Book createBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(Integer bookId, Book book) {
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                b.setBookId(book.getBookId());
                b.setName(book.getName());
                b.setAuthor(book.getAuthor());
                return b;
            }
        }
        return null;
    }

    public void deleteBook(Integer bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
    }
}
