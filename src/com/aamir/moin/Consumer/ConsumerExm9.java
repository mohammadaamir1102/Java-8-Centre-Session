package com.aamir.moin.Consumer;

import java.util.function.Consumer;

public class ConsumerExm9 {
    public static void main(String[] args) {
        Consumer<String> printConsumer = s -> System.out.println("Print: " + s);
        Consumer<String> lengthConsumer = s -> System.out.println("Length: " + s.length());

        // Chaining Consumers
        Consumer<String> consumer = printConsumer.andThen(lengthConsumer);

        // Using the chained Consumer
        consumer.accept("Hello, World!");
    }
}
