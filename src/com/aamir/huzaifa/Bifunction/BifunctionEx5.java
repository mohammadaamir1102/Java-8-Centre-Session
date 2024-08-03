package com.aamir.huzaifa.Bifunction;
import java.util.function.BiFunction;
public class BifunctionEx5 {
        public static void main(String[] args) {
            BiFunction<String, String, String> combineAndUppercase = (a, b) -> (a + b).toUpperCase();
            System.out.println(combineAndUppercase.apply("hello", "world"));
        }
    }


