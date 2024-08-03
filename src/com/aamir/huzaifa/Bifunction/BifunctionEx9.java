package com.aamir.huzaifa.Bifunction;

import java.util.function.BiFunction;

public class BifunctionEx9 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> subtract = (a, b) -> Math.subtractExact(a, b);
            System.out.println(subtract.apply(10, 3)); 
        }
    }


