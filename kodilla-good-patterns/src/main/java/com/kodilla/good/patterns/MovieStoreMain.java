package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challanges.MovieStore;

public class MovieStoreMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(movieTranslation -> movieTranslation.getValue().stream())
                .forEach(arg -> print(arg));
    }

    public static void print(String argument){
        System.out.print(argument + " ! ");
    }
}
