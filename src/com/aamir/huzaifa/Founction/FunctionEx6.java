package com.aamir.huzaifa.Founction;
import java.util.function.Function;
public class FunctionEx6 {
        public static void main(String[] args) {
            Function<String, String> greet = s -> "Hello, " + s;
            System.out.println(greet.apply("Alice")); // Output: Hello, Alice
        }
    }


