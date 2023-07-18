package com.saurav.MappingPractice.controller;

import com.saurav.MappingPractice.model.Address;
import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.service.AddressService;
import com.saurav.MappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping
    public String addBooks(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @GetMapping
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @GetMapping("/{studentID}")
    public ResponseEntity<Book> getBookByStudentID(@PathVariable Integer studentID){
        return bookService.getBookByStudentID(studentID);
    }
    @PutMapping("/{bookID}")
    public ResponseEntity<Book> updateBookByBookID(@PathVariable Integer bookID, @RequestBody Book book){
        return bookService.updateBookByBookID(bookID,book);
    }
    @DeleteMapping("/{bookID}")
    public String deleteBookByBookID(@PathVariable Integer bookID){
        return bookService.deleteBookByBookID(bookID);
    }
}
