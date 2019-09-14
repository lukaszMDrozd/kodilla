package com.kodilla.good.patterns.flightBrowser;

import java.util.Objects;

public class DepartureCity {

    private String departureCityName;

    public DepartureCity(final String departureCityName) {
        this.departureCityName = departureCityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartureCity that = (DepartureCity) o;
        return departureCityName.equals(that.departureCityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCityName);
    }

    public String getDepartureCityName() {
        return departureCityName;
    }

    public String toString() {
        return getDepartureCityName();
    }
}
