package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(){
        super("\'Wystąpił błąd - Nie ma takiego lotniska dostępnego.\'");
    }
}
