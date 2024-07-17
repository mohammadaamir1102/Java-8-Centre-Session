package com.aamir.huzaifa;
import java.util.function.Predicate;
public class UsingorOperator{
	    public static void main(String[] args) {
	        Predicate<Integer> isEven = num -> num % 2 == 0;
	        Predicate<Integer> isGreaterThanTen = num -> num > 10;	       
	        Predicate<Integer> isEvenOrGreaterThanTen = isEven.or(isGreaterThanTen);
	        int[] numbers = {5, 8, 12, 15, 19, 20};
	        for (int number : numbers) {
	            if (isEvenOrGreaterThanTen.test(number)) {
	                System.out.println(number + " is either even or greater than 10");
	            } else {
	                System.out.println(number + " is neither even nor greater than 10");
	            }
	        }
	    }
	}



