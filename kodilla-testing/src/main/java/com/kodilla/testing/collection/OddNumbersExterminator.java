package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator{

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) throws IndexOutOfBoundsException{
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        if (numbers.isEmpty()){
            throw new IndexOutOfBoundsException("Given List is empty");
        }

        for(Integer number: numbers){
            if(number % 2 != 0){
                continue;
            }
            evenNumbers.add(number);
        }
        return evenNumbers;
    }
}
