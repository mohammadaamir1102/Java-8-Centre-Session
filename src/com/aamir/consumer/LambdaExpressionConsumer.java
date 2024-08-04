package com.aamir.consumer;

import java.util.function.Consumer;

public class LambdaExpressionConsumer {
	public static void main(String[] args) {
        Consumer<Integer> consumer = lamda -> System.out.println("Value: " + lamda);
        consumer.accept(10);
    }
}
