package com.aamir.huzaifa.Founction;
import java.util.function.Function;
public class FunctionEx8 {
        public static void main(String[] args) {
            Function<String, String> trimSpaces = s -> s.trim();
            System.out.println(trimSpaces.apply("  Hello, World!  ")); // Output: Hello, World!
        }
    }


