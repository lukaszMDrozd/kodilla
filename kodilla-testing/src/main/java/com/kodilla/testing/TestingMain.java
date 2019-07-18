package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        calculator.setA(3);
        calculator.setB(5);

        int resultCalc = calculator.getA() + calculator.getB();

        if(resultCalc == calculator.add(4,5)){
            System.out.println("Calculator.Add() test OK");
        } else {
            System.out.println("Error!");
        }

        calculator.setA(3);
        calculator.setB(5);
        resultCalc = calculator.getA() - calculator.getB();

        if(resultCalc == calculator.subtract(4,5)){
            System.out.println("Calculator.Subtract() test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
