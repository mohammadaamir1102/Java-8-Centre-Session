package com.aamir.consumer;

import java.util.function.Consumer;

public class ChainingConsumer {

	 public static void main(String[] args) {
	        Consumer<String> consumer1 = chain1 -> System.out.println("Consumer 1: " + chain1);
	        Consumer<String> consumer2 = chain2 -> System.out.println("Consumer 2: " + chain2);
	        consumer1.andThen(consumer2).accept("Chained Consumer");
	    }
}
