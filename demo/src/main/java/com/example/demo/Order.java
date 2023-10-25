package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Pay;

import lombok.Getter;

public class Order {

    @Getter
    private List<Item> items = new ArrayList<>();

    @Getter
    private Pay payment = new Pay();
    
    @Getter
    private Delivery delivery = new Delivery();

    public boolean isProcessed = false;

    public void SetPaymentStrategy(Pay pay){
        this.payment = pay;
    }

    public void SetDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public int calculateTotalPrice(){
        int price = 0;

        for (Item item : this.items){
            price += item.price();
        }

        return price;
    }

    public void processOrder(){
        isProcessed = true;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }



    
}
