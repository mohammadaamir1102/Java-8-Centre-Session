package com.aamir.byconsumer;

import java.util.function.BiConsumer;

public class ConditionalProcessingBiConsumer {

	public static void main(String[] args) {

		BiConsumer<String, Integer> biConsumer = (name, num) -> {
            if (num % 2 == 0) 
                System.out.println(name + " is even");
             else 
                System.out.println(name + " is odd");
        };
        biConsumer.accept("hundred", 5);
    }
	}

