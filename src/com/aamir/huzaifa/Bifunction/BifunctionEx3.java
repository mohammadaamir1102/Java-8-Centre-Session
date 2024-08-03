package com.aamir.huzaifa.Bifunction;

import java.util.function.BiFunction;

public class BifunctionEx3 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> power = (base, exponent) -> (int) Math.pow(base, exponent);
            System.out.println(power.apply(2, 3));
        }
    }

