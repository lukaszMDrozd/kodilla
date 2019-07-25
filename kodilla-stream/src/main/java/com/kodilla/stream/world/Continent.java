package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Country> listOfCountries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        listOfCountries.add(country);
    }

    public Set<Country> getListOfCountries() {
        return listOfCountries;
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
        return continentName.hashCode();
    }

    @Override
    public String toString(){
        return continentName + " zawiera: " + listOfCountries;
    }
}
