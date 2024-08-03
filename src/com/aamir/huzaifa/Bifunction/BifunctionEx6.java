package com.aamir.huzaifa.Bifunction;

import java.util.function.BiFunction;

public class BifunctionEx6{
        public static void main(String[] args) {
            BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
            System.out.println(multiply.apply(5.5, 4.2)); // Output: 23.1
        }
    }


