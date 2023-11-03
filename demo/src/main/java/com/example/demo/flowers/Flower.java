package com.example.demo.flowers;

import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @AllArgsConstructor
@Entity
public class Flower {
    @Id
    private int id;

    private double sepalLength;

    private FlowerColor color;

    private int price;
}