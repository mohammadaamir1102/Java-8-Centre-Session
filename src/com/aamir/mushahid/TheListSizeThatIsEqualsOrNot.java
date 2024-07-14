package com.aamir.mushahid;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class TheListSizeThatIsEqualsOrNot {

	public static void main(String[] args) {
		
		List<Integer> firstListData = getFirstListData();
		List<Integer> secondListData = getSecondListData();
		
		 BiPredicate<List<?>, List<?>> output =(firstList, secondList) -> firstList.size() == secondList.size();
		 System.out.println(output.test(firstListData, secondListData));
		 
	}
	public static List<Integer> getFirstListData(){
		return List.of(1,2,3);
	}
	public static List<Integer> getSecondListData(){
	List<Integer> secondList = new ArrayList<>();
	secondList.add(1);
	secondList.add(2);
	secondList.add(3);
	return secondList;
	}

}
