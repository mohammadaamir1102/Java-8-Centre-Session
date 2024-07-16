package com.aamir.sufiyan;

import java.util.List;
import java.util.function.Predicate;

public class TestIfAListEmptyOrNot {
	public static void main(String[] args) {

		List<Integer> listData = getListData();
		Predicate<List<Integer>> output = items -> !items.isEmpty();
		System.out.println(output.test(listData));
	}

	public static List<Integer> getListData() {

		// item.add(1);
		// item.add(2);
		// item.add(3);
		// item.add(4);
		// item.add(5);+
		// item.add(6);
		// item.add(7);

		return List.of(1, 2, 3, 4, 5, 6, 7);

	}
}
