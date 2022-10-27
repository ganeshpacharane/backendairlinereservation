package com.airline.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {

    @Id
    private long paymentId = (int)(Math.random()*9000)+10000000;

    private long cardNumber;

    private String cardHolderName;

    private String cardExMonth;

    private long cardExYear;

    private long cvv;

    public Payment(long paymentId, long cardNumber, String cardHolderName, String cardExMonth, long cardExYear, long cvv) {
        this.paymentId = paymentId;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardExMonth = cardExMonth;
        this.cardExYear = cardExYear;
        this.cvv = cvv;
    }

    public Payment() {
    }

    public long getPaymentId() {
        return paymentId;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardExMonth() {
        return cardExMonth;
    }

    public void setCardExMonth(String cardExMonth) {
        this.cardExMonth = cardExMonth;
    }

    public long getCardExYear() {
        return cardExYear;
    }

    public void setCardExYear(long cardExYear) {
        this.cardExYear = cardExYear;
    }

    public long getCvv() {
        return cvv;
    }

    public void setCvv(long cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", cardNumber=" + cardNumber +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardExMonth='" + cardExMonth + '\'' +
                ", cardExYear=" + cardExYear +
                ", cvv=" + cvv +
                '}';
    }
}
