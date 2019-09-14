package com.kodilla.good.patterns.flightBrowser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface ServiceDto {

    Map retrieve(String departureCityName, ArrayList<String> arrivalCityListNames, HashMap<DepartureCity, ArrivalCityList> singleFlightList);
}
