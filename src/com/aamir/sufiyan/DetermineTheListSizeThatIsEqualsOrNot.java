package com.aamir.sufiyan;

import java.util.List;
import java.util.function.BiPredicate;

public class DetermineTheListSizeThatIsEqualsOrNot {
	public static void main(String[] args) {
		List<Integer> firstListData = getFirstListData();
		List<Integer> secondListData = getSecondListData();
		List<Integer> thirdListData = getThirdListData();
		BiPredicate<List<?>, List<?>> output = (firstList, secondList) -> firstList.size() == secondList.size();

		System.out.println(output.test(firstListData, secondListData));
		System.out.println(output.test(secondListData, thirdListData));
		System.out.println(output.test(firstListData, thirdListData));

	}

	public static List<Integer> getFirstListData() {
		return List.of(1, 2, 3);
	}

	public static List<Integer> getSecondListData() {
		return List.of(4, 5, 6);
	}

	public static List<Integer> getThirdListData() {
		return List.of(8, 9, 10, 22);
	}
}
