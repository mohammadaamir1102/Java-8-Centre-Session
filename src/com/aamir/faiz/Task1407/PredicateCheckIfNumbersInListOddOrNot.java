package com.aamir.faiz.Task1407;

import java.util.List;
import java.util.function.Predicate;

public class PredicateCheckIfNumbersInListOddOrNot {

	public static void main(String[] args) {
		List<Integer> oddList = oddList();
		for (Integer integer : oddList) {
			Predicate<List<?>> checkOddOrNot = value -> integer % 2 != 0;
			System.out.println(checkOddOrNot.test(oddList));
		}
	}

	public static List<Integer> oddList() {
		return List.of(1, 2, 3, 5, 6);
	}

}
