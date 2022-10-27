package com.airline.controller;

import com.airline.exception.ResourceNotFoundException;
import com.airline.model.Book;
import com.airline.repository.BookingRepository;
import com.airline.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/getBookingDetails/{bookId}")
    public ResponseEntity<Book> getBookDetailsBYID(@PathVariable long bookId){
        Book bk = bookingRepository.findById(bookId)
                .orElseThrow(()-> new ResourceNotFoundException("BookId not found with id"+ bookId));

        return ResponseEntity.ok(bk);
    }

    @PostMapping("/bookflight")
    public ResponseEntity<Book> addBooking(@RequestBody Book book)
    {
        Book b1 = bookingService.bookingFlight(book);
        return ResponseEntity.ok(b1);
    }

    @DeleteMapping("/deleteBooking/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        Book bk = bookingRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Booking Id not exist"+ id));
        bookingRepository.delete(bk);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
