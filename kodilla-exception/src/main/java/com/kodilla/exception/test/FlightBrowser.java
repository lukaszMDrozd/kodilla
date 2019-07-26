package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightBrowser {
    private String result;

    public String findFilght(Flight flight) throws RouteNotFoundException{

        final HashMap<String, Boolean> availableFlightsMap = new HashMap<>();
        availableFlightsMap.put("JFK", true);
        availableFlightsMap.put("Chopin", true);
        availableFlightsMap.put("Heathrow", false);

        if(!availableFlightsMap.containsKey(flight.arrivalAirport)){
            throw new RouteNotFoundException();
        }
        return flight.arrivalAirport;
    }

    public static void main(String[] args) {

        Flight flight = new Flight("JFK", "Munich Airport");
        FlightBrowser flightBrowser = new FlightBrowser();

        try{
            flightBrowser.findFilght(flight);
            System.out.println(flight.arrivalAirport);
        } catch(RouteNotFoundException e){
            System.out.println(e.getClass().getSimpleName() + " -> " + e.getMessage());

        }
    }
}
