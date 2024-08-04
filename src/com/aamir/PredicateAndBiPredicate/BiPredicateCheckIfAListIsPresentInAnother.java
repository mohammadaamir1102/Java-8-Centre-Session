package com.aamir.PredicateAndBiPredicate;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateCheckIfAListIsPresentInAnother {

	public static void main(String[] args) {
		List<Integer> firsList = firsList();
		List<Integer> secondList = secondList();
		
		BiPredicate<List<?>, List<?>> listContainsOrNot=(list1,list2)->firsList.containsAll(secondList);
		System.out.println(listContainsOrNot.test(firsList, secondList));
	}
	
	public static List<Integer> firsList() {
		return List.of(1,2,3,4);
	}
	
	public static List<Integer> secondList() {
		return List.of(3,1,4,2);
	}
}
