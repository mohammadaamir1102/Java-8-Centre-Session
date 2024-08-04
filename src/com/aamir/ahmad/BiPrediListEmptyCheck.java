package com.aamir.ahmad;

import java.util.List;
import java.util.function.Predicate;

//import java.util.function.BiPredicate;

public class BiPrediListEmptyCheck {

	public static void main(String[] args) {
		List<Integer> list1 = list1();
		Predicate<List<?>> listIsEmpty=list2->list1.isEmpty();
		System.out.println(listIsEmpty.test(list1));

	}
	public static List<Integer> list1(){
	  return List.of(1,2);
	}

}
