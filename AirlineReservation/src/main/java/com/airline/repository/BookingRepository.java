package com.airline.repository;

import com.airline.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Book,Long> {

}
