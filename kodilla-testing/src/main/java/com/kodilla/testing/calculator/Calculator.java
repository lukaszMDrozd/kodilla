package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int add(int a, int b){
        setA(a);
        setB(b);
        return getA() + getB();
    }

    public int subtract(int a, int b){
        setA(a);
        setB(b);
        return getA() - getB();
    }

}
