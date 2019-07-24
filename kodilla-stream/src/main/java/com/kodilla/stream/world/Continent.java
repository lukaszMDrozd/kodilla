package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Country> theListOfCountries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        theListOfCountries.add(country);
    }

    public Set<Country> getTheListOfCountries() {
        return theListOfCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode() {
        int result = continentName.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return continentName + " zawiera: " + theListOfCountries;
    }
}
