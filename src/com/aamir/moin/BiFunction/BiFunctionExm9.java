package com.aamir.moin.BiFunction;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

public class BiFunctionExm9 {
    public static void main(String[] args) {
        BiFunction<LocalDate, LocalDate, Integer> calculateAge = (birthDate, currentDate) ->
                Period.between(birthDate, currentDate).getYears();


        LocalDate birthDate = LocalDate.of(2005, 5, 12);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge.apply(birthDate, currentDate);
        System.out.println("Age: " + age);
    }
}
