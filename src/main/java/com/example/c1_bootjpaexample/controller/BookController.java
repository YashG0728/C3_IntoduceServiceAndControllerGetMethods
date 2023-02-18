package com.example.c1_bootjpaexample.controller;

import com.example.c1_bootjpaexample.model.BookModel;
import com.example.c1_bootjpaexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;


    @GetMapping("/getbook")
    public String getBooks() {
        return "I am learning springboot from youtube";
    }

    @PostMapping("/postbook")
    public BookModel postBooks() {
        BookModel bookModel = new BookModel();
        bookModel.setId(1);
        bookModel.setTitle("Java Refrence");
        bookModel.setAuthor("xyz");
        return bookModel;
    }

    @GetMapping("/getallbook")
    public List<BookModel> getlistofbooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getbookusingid/{id}")
    public BookModel getbookusingid(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }
}
