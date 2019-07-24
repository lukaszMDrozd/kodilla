package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {

    private final Set<Continent> theListOfContinents = new HashSet<>();

    public Set<Continent> getTheListOfContinents() {
        return theListOfContinents;
    }

    public final BigDecimal getPeopleQuantity(){
        return theListOfContinents.stream()
                .flatMap(continent -> continent.getTheListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) ->  sum = sum.add(current));
    }

    @Override
    public String toString(){
        return "W moim zmyślonym świecie znajduje się " + getPeopleQuantity() + " ludzi";
    }
}
