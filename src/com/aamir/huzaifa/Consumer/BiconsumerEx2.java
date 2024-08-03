package com.aamir.huzaifa.Consumer;
import java.util.function.BiConsumer;
public class BiconsumerEx2 {
        public static void main(String[] args) {
            BiConsumer<String, String> concatStrings = (s1, s2) -> System.out.println("Concatenated: " + s1 + s2);
            concatStrings.accept("Hello, ", "World!");
        }
    }


