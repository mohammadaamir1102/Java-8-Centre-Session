package com.aamir.huzaifa.Bifunction;

import java.util.function.BiFunction;

public class BifunctionEx8 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Double> calculateDistance = (x, y) -> Math.sqrt(x * x + y * y);
            System.out.println(calculateDistance.apply(3, 4));
        }
    }


