package com.kodilla.good.patterns.challanges;

public class OrderDto {

    private User user;
    private boolean isCompleted;

    public OrderDto(final User user, final boolean isCompleted) {
        this.user = user;
        this.isCompleted = isCompleted;
    }

    public User getUser() {
        return user;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
