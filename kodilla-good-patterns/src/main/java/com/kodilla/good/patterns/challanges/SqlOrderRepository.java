package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class SqlOrderRepository implements OrderRepository {

    public boolean createOrder(User user, LocalDateTime orderDateTime) {
        System.out.println("Użytkowniku: " + user.getUserName() + " " + user.getUserSurname() + " zapis do bazy dla zamówienia z " + orderDateTime + " został wykonany poprawnie");
        return true;
    }
}
