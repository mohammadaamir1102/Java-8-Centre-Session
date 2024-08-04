package com.aamir.byconsumer;

import java.util.function.BiConsumer;

public class SimpleBiConsumer {
	public static void main(String[] args) {
		
		BiConsumer<String ,Integer> biConsumer=(name,age) -> System.out.println("Name ="+name+" "+"Age = "+age);
		biConsumer.accept("Abrar",20);
	}

}
