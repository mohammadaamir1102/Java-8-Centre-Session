package com.aamir.huzaifa;
import java.util.function.Predicate;
public class FindArrayLength {
	    public static void main(String[] args) {
	        Predicate<int[]> isArrayLengthGreaterThan5 = array -> array.length > 5;

	        System.out.println(isArrayLengthGreaterThan5.test(new int[]{1, 2, 3, 4, 5, 6})); 
	        System.out.println(isArrayLengthGreaterThan5.test(new int[]{1, 2, 3}));          
	    
	}

}
