package com.aamir.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListIterationConsumer {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Consumer<String> consumer = System.out::println;
       list.forEach(consumer);
    }
}
