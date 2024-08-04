package com.aamir.byconsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class StreamAPIBiConsumer {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		BiConsumer<Integer, Integer> consumer = (key, index) -> System.out.println(key + " " + index);
		for (int i = 0; i < list.size(); i++) {
			consumer.accept(i,list.get(i));
			
		}
	}

}
