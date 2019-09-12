package com.kodilla.good.patterns.foodOrder;

public class FoodOrderRequest {

    private FoodProducer foodProducer;
    private String FoodQuantity;
    private String FoodType;

    public FoodOrderRequest(final FoodProducer foodProducer, final String foodQuantity, final String foodType) {
        this.foodProducer = foodProducer;
        FoodQuantity = foodQuantity;
        FoodType = foodType;
    }

    public String getFoodQuantity() {
        return FoodQuantity;
    }

    public String getFoodType() {
        return FoodType;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }
}
