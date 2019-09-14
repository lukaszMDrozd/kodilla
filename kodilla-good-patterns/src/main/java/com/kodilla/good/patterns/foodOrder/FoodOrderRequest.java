package com.kodilla.good.patterns.foodOrder;

public class FoodOrderRequest {

    private FoodProducer foodProducer;
    private String foodQuantity;
    private String foodType;

    public FoodOrderRequest(final FoodProducer foodProducer, final String foodQuantity, final String foodType) {
        this.foodProducer = foodProducer;
        this.foodQuantity = foodQuantity;
        this.foodType = foodType;
    }

    public String getFoodQuantity() {
        return foodQuantity;
    }

    public String getFoodType() {
        return foodType;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }
}
