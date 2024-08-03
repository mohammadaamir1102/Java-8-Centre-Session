package com.aamir.huzaifa.Bifunction;

import java.util.function.BiFunction;

public class BifunctionEx7 {

        public static void main(String[] args) {
            BiFunction<String, Integer, String> formatString = (name, age) -> String.format("%s is %d years old", name, age);
            System.out.println(formatString.apply("Alice", 30));
        }
    }


