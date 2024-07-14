package com.aamir.mushahid;

import java.util.List;
import java.util.function.Predicate;

public class ListEmptyOrNot {

	public static void main(String[] args) {
		List<Integer> listData =getListData();
		Predicate<List<Integer>> output = items -> !items.isEmpty();
		System.out.println(output.test(listData));

	}

	public static List<Integer> getListData(){
		return List.of(1,2,3);
	}
}
