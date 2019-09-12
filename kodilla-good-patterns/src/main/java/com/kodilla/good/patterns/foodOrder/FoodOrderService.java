package com.kodilla.good.patterns.foodOrder;

public class FoodOrderService {

    public void OrderCreate(FoodOrderRequest foodOrderRequest) {
        if (foodOrderRequest.getFoodProducer().process()) {
            System.out.println("Zamówienie zrealizowane w ilości " + foodOrderRequest.getFoodQuantity());
        } else {
            System.out.println("Zamówienie nie zostało zrealizowane przez producenta");
        }
    }
}
