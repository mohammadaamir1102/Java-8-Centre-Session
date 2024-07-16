package com.aamir.Tufail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class DetermineTheListSizeIsEqualsOrNot {
	public static void main(String[] args) {
		List<Integer>firstListData=getFirstListData();
		List<Integer>secondListData=getSecondListData();
		List<String>thirdlistData=getthirdListData();
		BiPredicate< List<?>,List<?> >output=(firstList,thirdList)->firstList.size()==thirdList.size();
		System.out.println(output.test(firstListData, thirdlistData));	}
	public static List<Integer>getFirstListData(){
		
		return List.of(1,2,3,4);
	}
	public static List<Integer>getSecondListData(){
		List<Integer>secondList=new ArrayList<>();
		secondList.add(10);
		secondList.add(20);
		secondList.add(30);
		secondList.add(40);
		secondList.add(50);
		return secondList;
	}
	public static List<String>getthirdListData(){
		return Arrays.asList("a","b","c","d");
	}

}
