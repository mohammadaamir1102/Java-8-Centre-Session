package com.aamir.huzaifa;
import java.util.function.BiPredicate;
public class BiPredicatExa1 {
	    public static void main(String[] args) {
	        BiPredicate<Integer, Integer> areEqual = (x, y) -> x.equals(y);

	        System.out.println(areEqual.test(5, 5)); 
	        System.out.println(areEqual.test(5, 10)); 
	    }
	}



