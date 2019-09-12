package com.kodilla.good.patterns;
import com.kodilla.good.patterns.challanges.*;

public class OrderApplication {
    public static void main(String[] args) {

        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new SmsInformationService(), new QuickOrderService(), new SqlOrderRepository());
        productOrderService.process(orderRequest);
    }
}
