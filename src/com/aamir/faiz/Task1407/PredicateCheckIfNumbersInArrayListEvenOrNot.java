package com.aamir.faiz.Task1407;

import java.util.List;
import java.util.function.Predicate;

public class PredicateCheckIfNumbersInArrayListEvenOrNot {

	public static void main(String[] args) {
		List<Integer> evenList = evenList();
		for (Integer integer : evenList) {
			Predicate<List<?>> checkEvenOrNot = value -> integer % 2 == 0;
			System.out.println(checkEvenOrNot.test(evenList));
		}
	}

	public static List<Integer> evenList() {
		return List.of(2, 4, 6,7, 8);
	}

}
