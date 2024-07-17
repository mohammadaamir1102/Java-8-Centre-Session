package com.aamir.faiz;

import java.util.List;
import java.util.function.Predicate;

public class CheckIfAListIsGreaterThanAnyNumber {

	public static void main(String[] args) {
		List<Integer> list = list();
		Predicate<List<Integer>> chePredicate=list1-> list.size()>5;
		System.out.println(chePredicate.test(list));

	}
	public static List<Integer> list() {
		return List.of(1,2,3,4,5,6);
		
	}

}
