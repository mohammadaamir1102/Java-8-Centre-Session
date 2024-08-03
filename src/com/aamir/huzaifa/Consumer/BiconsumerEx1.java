package com.aamir.huzaifa.Consumer;
import java.util.function.BiConsumer;
public class BiconsumerEx1 {
        public static void main(String[] args) {
            BiConsumer<Integer, Integer> addNumbers = (a, b) -> System.out.println("Sum: " + (a + b));
            addNumbers.accept(5, 10);
        }
    }

