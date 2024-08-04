package com.aamir.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConditionalProcessingConsumer {
	public static void main(String[] args) {
		
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	Consumer<Integer> consumer =number -> {
			if (number%2==0) {
				System.out.println("Odd number :-"+" "+number);
			}
	};
	list.forEach(consumer);
}
}
