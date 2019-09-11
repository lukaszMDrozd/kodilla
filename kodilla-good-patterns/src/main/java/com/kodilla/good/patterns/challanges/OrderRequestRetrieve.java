package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class OrderRequestRetrieve {

    public OrderRequest retrieve() {
        User user = new User("Łukasz", "Drozd", "598345654");
        LocalDateTime orderDateTime = LocalDateTime.of(2019, 9,10,1, 11);

        return new OrderRequest(user, orderDateTime);
    }
}
