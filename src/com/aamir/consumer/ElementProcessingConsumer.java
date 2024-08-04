package com.aamir.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ElementProcessingConsumer {

	public static void main(String[] args) {
		List<Integer > list= Arrays.asList(1,2,3,4,5,6);
		Consumer<Integer> consume= multiple -> System.out.println(multiple*multiple);
		list.forEach(consume);
	}
}
