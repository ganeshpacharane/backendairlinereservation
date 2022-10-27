package com.airline.controller;

import com.airline.model.Payment;
import com.airline.repository.PaymentRepository;
import com.airline.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/paymentDetails")
    public Payment paymentBookDetails(@RequestBody Payment payment){
          return paymentService.paymentDetails(payment);
    }

}
