package com.example.demo.payment;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class PaymentController {
    @GetMapping("/list")
    public List<Pay> getDeliveries(List<Pay> payments) {
        return payments;
    }
}