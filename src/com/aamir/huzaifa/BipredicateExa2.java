package com.aamir.huzaifa;
import java.util.function.BiPredicate;
public class BipredicateExa2 {
	    public static void main(String[] args) {
	        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;

	        System.out.println(isSumEven.test(4, 6)); 
	        System.out.println(isSumEven.test(4, 7)); 
	    }
	}



