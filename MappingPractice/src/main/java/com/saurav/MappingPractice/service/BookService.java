package com.saurav.MappingPractice.service;

import com.saurav.MappingPractice.model.Address;
import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.model.Student;
import com.saurav.MappingPractice.repository.IAddressRepo;
import com.saurav.MappingPractice.repository.IBookRepo;
import com.saurav.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;
    @Autowired
    IStudentRepo studentRepo;
    public String addBook(Book book) {
        if(book != null){
            bookRepo.save(book);
            return "Book is added in our database";
        }
        return "Not added";
    }

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    public ResponseEntity<Book> getBookByStudentID(Integer studentID) {
        Book book = null;
        HttpStatus status = null;
        if(studentRepo.existsById(studentID)) {
            Optional<Student> student = studentRepo.findById(studentID);
            book = bookRepo.findFirstByStudent(student);
            status = HttpStatus.ACCEPTED;
        }
        return new ResponseEntity<>(book,status);
    }

    public ResponseEntity<Book> updateBookByBookID(Integer bookID, Book book) {
        Book oldBook = null;
        HttpStatus status = null;
        if(bookRepo.existsById(bookID)){
            oldBook = bookRepo.findFirstByBookID(bookID);
            oldBook.setBookTitle(book.getBookTitle());
            oldBook.setBookAuthor(book.getBookAuthor());
            oldBook.setBookDescription(book.getBookDescription());
            oldBook.setBookPrice(book.getBookPrice());
            bookRepo.save(oldBook);
            status = HttpStatus.ACCEPTED;
        }
        assert status != null;
        return new ResponseEntity<>(oldBook,status);
    }

    public String deleteBookByBookID(Integer bookID) {
        if(bookRepo.existsById(bookID)){
            bookRepo.deleteById(bookID);
            return "Deleted successfull";
        }
        return "Please enter valid Book ID";
    }
}
