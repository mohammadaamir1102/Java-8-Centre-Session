package com.sameer.Lambda.Predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenOddWithPredicate {
	public static void main(String[] args) {

		List<Integer> of = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> isEven = even -> even % 2 == 0;
		Predicate<Integer> isOdd = even -> even % 2 != 0;

		List<Integer> evenNumbers = of.stream().filter(isEven).collect(Collectors.toList());
		System.out.println(evenNumbers);

		List<Integer> oddNumbers = of.stream().filter(isOdd).collect(Collectors.toList());
		System.out.println(oddNumbers);

	}

}
