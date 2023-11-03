package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public abstract class Item {
    private String description;

    public abstract int price();
    public Item(String description_1, int pirce){
        description = description_1;
    }
}
