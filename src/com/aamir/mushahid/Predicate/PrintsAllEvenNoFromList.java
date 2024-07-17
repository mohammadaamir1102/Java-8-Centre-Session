package com.aamir.mushahid.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrintsAllEvenNoFromList {
	
	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        Predicate<Integer> isEvenNumber = num -> num % 2 == 0;
	      System.out.println("Even Numbers are:-");
	       numbers.stream() .filter(isEvenNumber) .forEach(System.out::println);
	}

}