package com.aamir.huzaifa.Founction;

import java.util.function.Function;

public class FounctionEx10 {
        public static void main(String[] args) {
            Function<Double, Double> celsiusToFahrenheit = c -> (c * 9/5) + 32;
            System.out.println(celsiusToFahrenheit.apply(25.0)); // Output: 77.0
        }
    }


