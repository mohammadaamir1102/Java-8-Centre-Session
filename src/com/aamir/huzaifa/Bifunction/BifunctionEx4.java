package com.aamir.huzaifa.Bifunction;
import java.util.function.BiFunction;
public class BifunctionEx4 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> max = (a, b) -> Math.max(a, b);
            System.out.println(max.apply(10, 20));
        }
    }


