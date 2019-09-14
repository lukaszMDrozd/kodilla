package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayVale(double val) {
        System.out.println("Wynik to: " + val);
    }
}
