package com.aamir.abrar;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BothStringEqualOrNot {

	public static void main(String[] args) {
		
	BiPredicate<int[],int[]> checkBiPredicate = (arr1, arr2) -> arr1.length == arr2.length;
	System.out.println(checkBiPredicate.test(new int[] {1,2,3}, new int[] {1,2,3}));
	List<String> firStrings=firstList();
	List<String> firStrings2=SecondList();

		BiPredicate <List<String>,List<String>> bothStringSizeSameOrNot=(list1,list2) -> list1.size()!=list2.size();
		 
		System.out.println(bothStringSizeSameOrNot.test(firStrings, firStrings2));
	}

	public static List<String> firstList()
	{
		return Arrays.asList("Ab","Abra","Abrar");
	}
	
	public static List<String> SecondList()
	{
		return Arrays.asList("abrar","Abr","khan");
	}
	
}
