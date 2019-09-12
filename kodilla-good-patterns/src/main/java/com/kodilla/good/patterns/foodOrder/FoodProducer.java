package com.kodilla.good.patterns.foodOrder;

public class FoodProducer implements Producer{

    private String foodProducerName;

    public FoodProducer(String foodProducerName) {
        this.foodProducerName = foodProducerName;
    }

    public String getFoodProducerName() {
        return foodProducerName;
    }

    public boolean process()  {
        System.out.println("Zamówienie potwierdzone dla " + getFoodProducerName());
        return true;
    }
}
