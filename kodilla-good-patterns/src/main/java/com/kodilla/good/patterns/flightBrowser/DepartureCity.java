package com.kodilla.good.patterns.flightBrowser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DepartureCity {

    private String departureCityName;
    private LocalDateTime localDateTime = LocalDateTime.now();

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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getFormatTimeNow(LocalDateTime now) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        return formatDateTime;
    }

    public String toString() {
        return "Udaneg wylotu z: " + getDepartureCityName() + " o godzinie: " + getFormatTimeNow(getLocalDateTime());
    }
}
