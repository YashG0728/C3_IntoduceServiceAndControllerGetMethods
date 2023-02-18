package com.example.c1_bootjpaexample.service;

import com.example.c1_bootjpaexample.model.BookModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static List<BookModel> list = new ArrayList<>();

    static {
        list.add(new BookModel(2, "java complete reference", "xyz"));
        list.add(new BookModel(3, "java complete reference", "abc"));
        list.add(new BookModel(4, "java complete reference", "def"));
    }

    public List<BookModel> getAllBooks(){
        return list;
    }

    public BookModel getBookById(int id){
        BookModel bookModel = list.stream().filter(e->e.getId()==id).findFirst().get();
        return bookModel;
    }
}
