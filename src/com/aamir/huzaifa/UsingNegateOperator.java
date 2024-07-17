package com.aamir.huzaifa;

import java.util.function.Predicate;

public class UsingNegateOperator {
	    public static void main(String[] args) {
	        Predicate<Integer> isEven = num -> num % 2 == 0;
	        Predicate<Integer> isNotEven = isEven.negate();

	        // Test the negated predicate
	        int[] numbers = {1, 2, 3, 4, 5, 6};

	        for (int number : numbers) {
	            if (isNotEven.test(number)) {
	                System.out.println(number + " is not even");
	            } else {
	                System.out.println(number + " is even");
	            }
	        }
	    }
	}
