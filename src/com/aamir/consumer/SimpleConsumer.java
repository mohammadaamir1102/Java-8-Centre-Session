package com.aamir.consumer;

import java.util.function.Consumer;

public class SimpleConsumer {
	 public static void main(String[] args) {
	        Consumer<String> printConsumer = System.out::println;
	        printConsumer.accept("Hello Consumer");
	    } 
}
