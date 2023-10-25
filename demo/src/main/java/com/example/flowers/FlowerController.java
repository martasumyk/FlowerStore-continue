package com.example.flowers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> getFlowers() {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower(45, FlowerColor.RED, (int) 0.8));
        return flowers;
    }
}
