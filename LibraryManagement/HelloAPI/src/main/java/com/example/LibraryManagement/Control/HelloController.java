package com.example.LibraryManagement.Control;
import com.example.LibraryManagement.Service.BookService;
import com.example.LibraryManagement.Model.Book;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    public BookService bookService;

    @GetMapping("/book/{bookid}")
    private Book getBooks(@PathVariable("bookid") String bookid)
    {

        return bookService.getBook(bookid);
    }
    @PostMapping("/books")
    private String saveBook(@RequestBody Book books)
    {
        bookService.createBook(books);
        return books.getBookId();
    }
}


