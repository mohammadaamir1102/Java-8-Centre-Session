package com.aamir.mushahid.Predicate;


import java.util.function.Predicate;

public class NumberIsBetween1or10 {
    public static void main(String[] args) {
        Predicate<Integer> isLeapYear = year -> {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        };

        System.out.println(isLeapYear.test(2027)); 
        System.out.println(isLeapYear.test(2023));
    }
}
