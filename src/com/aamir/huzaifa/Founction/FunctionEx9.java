package com.aamir.huzaifa.Founction;

import java.util.function.Function;

public class FunctionEx9 {
        public static void main(String[] args) {
            Function<Integer, Integer> factorial = n -> {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                return result;
            };
            System.out.println(factorial.apply(5)); // Output: 120
        }
    }


