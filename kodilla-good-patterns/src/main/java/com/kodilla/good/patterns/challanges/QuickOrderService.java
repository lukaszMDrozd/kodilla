package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class QuickOrderService implements OrderService {

    public boolean order(User user, LocalDateTime when){
        System.out.println("Realizacja zamówienia dla użytkownika: " + user.getUserName() + " " + user.getUserSurname());
        return when.isBefore(LocalDateTime.now());
    }
}
