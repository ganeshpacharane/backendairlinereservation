package com.airline.service;

import com.airline.model.Book;
import com.airline.model.Payment;
import com.airline.repository.BookingRepository;
import com.airline.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    public Book bookingFlight(Book book){
       return bookingRepository.save(book);
    }

    public void deleteBooking(long id){

        bookingRepository.deleteById(id);
    }




}
