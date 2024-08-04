package com.aamir.consumer;

import java.util.function.Consumer;

public class MethodReferenceConsumer {

	public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello, Method Reference!");
    }
}
