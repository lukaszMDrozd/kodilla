package com.kodilla.good.patterns;

import com.kodilla.good.patterns.foodOrder.FoodOrderRequest;
import com.kodilla.good.patterns.foodOrder.FoodOrderRequestRetrieve;
import com.kodilla.good.patterns.foodOrder.FoodOrderService;

public class FoodOrderApplication {
    public static void main(String[] args) {

        FoodOrderRequestRetrieve foodOrderRequestRetrieve = new FoodOrderRequestRetrieve();
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetrieve.retrieve();

        FoodOrderService foodOrderService = new FoodOrderService();
        foodOrderService.OrderCreate(foodOrderRequest);
    }
}
