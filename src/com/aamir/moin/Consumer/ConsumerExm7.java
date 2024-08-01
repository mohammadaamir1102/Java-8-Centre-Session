package com.aamir.moin.Consumer;

import java.util.function.Consumer;

public class ConsumerExm7 {
    public static void main(String[] args) {
        Consumer<String> consumer=string -> System.out.println(string.substring(3));
        consumer.accept("Welcome");
    }
}
