package com.aamir.huzaifa.Consumer;

import java.util.function.Consumer;
public class ConsumerEx7 {
        public static void main(String[] args) {
            // Create a Consumer that prints a string
            Consumer<String> printConsumer = (String s) -> System.out.println(s);

            // Use the Consumer
            printConsumer.accept("Hello, Consumer Interface!");
        }
    }


