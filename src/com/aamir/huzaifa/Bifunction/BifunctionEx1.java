package com.aamir.huzaifa.Bifunction;

import java.util.function.BiFunction;

public class BifunctionEx1 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
            System.out.println(add.apply(5, 3));
        }
    }

