package com.sameer.Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckListIsEmptyOrNot {
	public static void main(String[] args) {

		Predicate<List<?>> emptyOrNot = list -> list.isEmpty();
		
		System.out.println(emptyOrNot.test(List.of(1, 2, 3, 4, 5)));
		
		System.out.println(emptyOrNot.test(Arrays.asList()));

	}

}
