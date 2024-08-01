package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm5 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printConsumer = (name, age) -> System.out.println("Name: " + name + ", Age: " + age);
        BiConsumer<String, Integer> checkAdultConsumer = (name, age) -> {
            if (age >= 18) {
                System.out.println(name + " is an adult.");
            } else {
                System.out.println(name + " is not an adult.");
            }
        };


        BiConsumer<String, Integer> chainedConsumer = printConsumer.andThen(checkAdultConsumer);


        chainedConsumer.accept("Abdul", 30);
        chainedConsumer.accept("Faiz", 10);
    }
}
