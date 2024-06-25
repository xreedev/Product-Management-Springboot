package com.example.HelloAPI.Control;
import com.example.HelloAPI.Service.BookService;
import com.example.HelloAPI.Model.Book;
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


