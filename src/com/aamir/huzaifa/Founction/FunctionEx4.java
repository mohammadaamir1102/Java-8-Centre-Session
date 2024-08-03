package com.aamir.huzaifa.Founction;
import java.util.function.Function;
public class FunctionEx4 {
        public static void main(String[] args) {
            Function<String, String> toUpperCase = s -> s.toUpperCase();
            System.out.println(toUpperCase.apply("hello"));
        }
    }


