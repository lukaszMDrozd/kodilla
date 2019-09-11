package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderDateTime;

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public OrderRequest(final User user, final LocalDateTime orderDateTime) {

        this.user = user;
        this.orderDateTime = orderDateTime;
    }
}
