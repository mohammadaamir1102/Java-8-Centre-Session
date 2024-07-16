package com.aamir.Tufail;

import java.util.List;
import java.util.function.Predicate;

public class PredicateCheckEmptyOrNot {
	public static void main(String[] args) {
		List<Integer>listData=getListData();
		Predicate< List<Integer>>output=items->items.isEmpty();
		System.out.println(output.test(listData));
	}
	private static List<Integer>getListData() {
		return List.of(1,2,3,4,5);
	

	}

}
