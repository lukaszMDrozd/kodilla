package com.kodilla.good.patterns;

import com.kodilla.good.patterns.flightBrowser.ArrivalCityList;
import com.kodilla.good.patterns.flightBrowser.DepartureCity;
import com.kodilla.good.patterns.flightBrowser.FlightDepartureBasedFilter;
import com.kodilla.good.patterns.flightBrowser.FlightListRetrieve;

import java.util.HashMap;
import java.util.List;

public class FlightApplication {

    public static void main(String[] args) {

        FlightListRetrieve flightListRetrieve = new FlightListRetrieve();
        HashMap<DepartureCity, ArrivalCityList> result = flightListRetrieve.flightListRetrieve();

        result.entrySet().forEach(System.out::println);

        FlightDepartureBasedFilter flightDepartureBasedFilter = new FlightDepartureBasedFilter();

        System.out.println("Filtr dla miasta wylotu =\"GDAŃSK\"");
        List<String> departureBasedFlightListResult = flightDepartureBasedFilter.departureFilter(result, "GDAŃSK");
        departureBasedFlightListResult.forEach(System.out::println);

        System.out.println("Filtr dla miasta przylotu =\"POZNAŃ\"");
        List<String> arrivalBasedFlightsListResult = flightDepartureBasedFilter.arrivalFilter(result, "POZNAŃ");
        arrivalBasedFlightsListResult.forEach(System.out::println);

        System.out.println("Filtr dla miasta pośredniego =\"WARSZAWA\"");
        flightDepartureBasedFilter.fixedFilter(result, "WARSZAWA");
    }
}
