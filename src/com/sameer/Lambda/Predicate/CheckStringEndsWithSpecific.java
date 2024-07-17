package com.sameer.Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CheckStringEndsWithSpecific {

	public static void main(String[] args) {

		List<String> fruit = Arrays.asList("apple", "banana", "cherry", "date");
		
		Predicate<String> contains = str -> str.endsWith("e");
		
		List<String> collect = fruit.stream().filter(contains).collect(Collectors.toList());

		System.out.println(collect);
	}

}
