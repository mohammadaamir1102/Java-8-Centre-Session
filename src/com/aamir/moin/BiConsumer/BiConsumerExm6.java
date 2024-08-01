package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm6 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> divideConsumer = (a, b) -> {
            try {
                System.out.println("Result: " + (a / b));
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
            }
        };


        divideConsumer.accept(10, 2);
        divideConsumer.accept(10, 0);
    }
}
