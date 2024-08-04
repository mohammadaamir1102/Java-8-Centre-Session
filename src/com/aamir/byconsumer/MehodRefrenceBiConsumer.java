package com.aamir.byconsumer;

import java.util.function.BiConsumer;

public class MehodRefrenceBiConsumer {

	public static void main(String[] args) {
		
		 BiConsumer<String, String> biConsumer = String::concat;
	        biConsumer.accept("Hello, ", "World!");
	       System.out.println("not calling method refrence");
	}
}
