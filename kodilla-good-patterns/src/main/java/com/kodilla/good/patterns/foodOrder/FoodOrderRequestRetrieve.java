package com.kodilla.good.patterns.foodOrder;

public class FoodOrderRequestRetrieve {

    public FoodOrderRequest retrieve() {

        FoodProducer foodProducer = new FoodProducer("MyBestFood");
        String foodQuantity = "4 sztuki";
        String foodType = "Zestawy obiadowe moje żarełko";

        return new FoodOrderRequest(foodProducer, foodQuantity, foodType);
    }
}
