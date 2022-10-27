package com.airline.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BookTicket")
public class Book {

    @Id
    private long bookId = (int)(Math.random()*9000)+1000;

    private String emailId;

    private long mobileNo;

    @DateTimeFormat(pattern="dd-MM-yyyy")
    private Date date;

    private int noOfPerson;

    public Book(String emailId, long mobileNo, Date date, int noOfPerson) {
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.date = date;
        this.noOfPerson = noOfPerson;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", emailId='" + emailId + '\'' +
                ", mobileNo=" + mobileNo +
                ", date=" + date +
                ", noOfPerson=" + noOfPerson +
                '}';
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNoOfPerson() {
        return noOfPerson;
    }

    public void setNoOfPerson(int noOfPerson) {
        this.noOfPerson = noOfPerson;
    }
}
