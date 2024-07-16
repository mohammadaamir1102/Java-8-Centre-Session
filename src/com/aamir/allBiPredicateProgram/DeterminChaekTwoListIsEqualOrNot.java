package com.aamir.allBiPredicateProgram;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class DeterminChaekTwoListIsEqualOrNot {

	public static void main(String[] args) {
		List<?> firstList1 = getFirstList();
		List<?> getsecondList2 = getsecondList();
		

		BiPredicate<List<?>, List<?>> output = (firstList, getsecondList) -> firstList.size() == getsecondList.size();
		System.out.println(output.test(firstList1, getsecondList2));

	}

	public static List<Integer> getFirstList() {
		return Arrays.asList(1, 2, 3, 4, 5);
	}

	public static List<Integer> getsecondList() {
		return Arrays.asList(1, 7, 8, 9, 5);
	}
	

}
