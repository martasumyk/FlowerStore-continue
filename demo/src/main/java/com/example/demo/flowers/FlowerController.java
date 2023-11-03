package com.example.demo.flowers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    public FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }

    @GetMapping("/list")
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower){
        flowerService.add(flower);
    }


    //@GetMapping("/list")
    //public List<Flower> getFlowers() {
     //   List<Flower> flowers = new ArrayList<>();
      //  flowers.add(new Flower(45, FlowerColor.RED, (int) 0.8));
        //return flowers;
    }
