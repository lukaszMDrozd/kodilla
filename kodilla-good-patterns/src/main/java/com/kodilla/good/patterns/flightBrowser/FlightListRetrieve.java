package com.kodilla.good.patterns.flightBrowser;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightListRetrieve {
    private HashMap<DepartureCity, ArrivalCityList> flightsList = new HashMap<>();
    private FlightServiceDto flightServiceDto = new FlightServiceDto();

    public HashMap<DepartureCity, ArrivalCityList> flightListRetrieve() {


        ArrayList<String> arrivalCitiesForGdansk = new ArrayList<>();
        arrivalCitiesForGdansk.add("WROCŁAW");
        arrivalCitiesForGdansk.add("WARSZAWA");
        arrivalCitiesForGdansk.add("POZNAŃ");

        flightServiceDto.retrieve("GDAŃSK", arrivalCitiesForGdansk, flightsList);

        ArrayList<String> arrivalCitiesForWarszawa = new ArrayList<>();
        arrivalCitiesForWarszawa.add("LUBLIN");
        arrivalCitiesForWarszawa.add("KRAKÓW");
        arrivalCitiesForWarszawa.add("POZNAŃ");

        flightServiceDto.retrieve("WARSZAWA", arrivalCitiesForWarszawa, flightsList);

        return flightsList;
    }
}
