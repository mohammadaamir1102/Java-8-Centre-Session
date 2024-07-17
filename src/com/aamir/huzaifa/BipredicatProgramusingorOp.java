package com.aamir.huzaifa;
import java.util.function.BiPredicate;
public class BipredicatProgramusingorOp {
	    public static void main(String[] args) {
	      
	        BiPredicate<Integer, Integer> isFirstGreaterThanSecond = (x, y) -> x > y;
	        BiPredicate<Integer, Integer> isFirstEven = (x, y) -> x % 2 == 0;

	      
	        BiPredicate<Integer, Integer> combinedPredicate = isFirstGreaterThanSecond.or(isFirstEven);

	       
	        Integer[][] testCases = {{10, 5},     {4, 8},   {3, 5},      {2, 2},     {5, 10}  };
		             
	        for (Integer[] testCase : testCases) {
	           Integer x = testCase[0];
	           Integer y = testCase[1];

	            System.out.println("Testing: (" + x + ", " + y + ")");
	            System.out.println("isFirstGreaterThanSecond: " + isFirstGreaterThanSecond.test(x, y));
	            System.out.println("isFirstEven: " + isFirstEven.test(x, y));
	            System.out.println("combinedPredicate: " + combinedPredicate.test(x, y));
	            System.out.println();
	        }
	    }
	}



