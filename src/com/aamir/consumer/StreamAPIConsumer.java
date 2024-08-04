package com.aamir.consumer;

import java.util.Arrays;
import java.util.List;

public class StreamAPIConsumer {
public static void main(String[] args) {
	List<String>  list= Arrays.asList("Abrar","khan","6390");
	list.stream().forEach(System.out::println);
}
}
