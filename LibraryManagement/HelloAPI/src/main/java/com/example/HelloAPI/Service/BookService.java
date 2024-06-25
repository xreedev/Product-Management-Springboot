package com.example.HelloAPI.Service;

import com.example.HelloAPI.Model.BookRepository;
import com.example.HelloAPI.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {
    BookRepository bookRepository;

    public Book getBook(String id) {
        Book wantedBook = null;
        ArrayList<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(bookList::add);
        for (Book book : bookList) {
            if (book.getBookId().equals(id))
                wantedBook = book;
            else
                wantedBook = new Book("404", "NOT FOUND", "No Book with that name");
        }
        return wantedBook;
    }
    public void createBook(Book book){
        bookRepository.save(book);
    }

}
