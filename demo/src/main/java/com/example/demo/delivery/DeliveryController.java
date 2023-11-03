package com.example.demo.delivery;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    @GetMapping("/list")
    public List<Delivery> getDeliveries(List<Delivery> deliveries) {
        return deliveries;
    }
}
