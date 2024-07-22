package com.aamir.huzaifa;
import java.util.function.BiPredicate;

public class BipredicateEx6 {
	
	    public static void main(String[] args) {
	        BiPredicate<int[], int[]> areArrayLengthsEqual = (arr1, arr2) -> arr1.length == arr2.length;
			// this task is given by Aamir
	      System.out.println(areArrayLengthsEqual.test(new int[]{1, 2, 3}, new int[]{4, 5, 6})); 
	      System.out.println(areArrayLengthsEqual.test(new int[]{1, 2}, new int[]{4, 5, 6}));
	    }
	}



