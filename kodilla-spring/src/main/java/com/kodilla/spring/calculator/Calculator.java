package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double result;
        result = a + b;
        display.displayVale(result);
        return result;
    }

    public double sub(double a, double b) {
        double result;
        result = a - b;
        display.displayVale(result);
        return result;
    }

    public double mul(double a, double b) {
        double result;
        result = a * b;
        display.displayVale(result);
        return result;
    }

    public double div(double a, double b) {
        double result;
        result = a / b;
        display.displayVale(result);
        return result;
    }
}
