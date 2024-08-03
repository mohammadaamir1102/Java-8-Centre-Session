package com.aamir.huzaifa.Bifunction;
import java.util.function.BiFunction;
public class BifunctionEx2 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, String> concat = (a, b) -> a.toString().concat(b.toString());
            System.out.println(concat.apply(12,12));
        }
    }


