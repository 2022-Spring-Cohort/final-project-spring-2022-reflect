package com.project.reflect.Controller;

import com.project.reflect.Model.Book;
import com.project.reflect.Repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private BookRepository bookRepo;

    public BookController(BookRepository bookRepo){
        this.bookRepo = bookRepo;
    }

    @GetMapping("/books")
    public Iterable<Book> getBooks(){
        return bookRepo.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable long id){
        return bookRepo.findById(id).get();
    }
}
