package com.aamir.moin.Consumer;

import java.util.function.Consumer;

public class ConsumerExm6 {
    public static void main(String[] args) {
        Consumer<String> consumer=string -> System.out.println(string.startsWith("Abd"));
        consumer.accept("Abdul");
    }
}
