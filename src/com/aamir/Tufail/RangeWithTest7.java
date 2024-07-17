package com.aamir.Tufail;

import java.util.function.Predicate;

public class RangeWithTest7 {
	    public static void main(String[] args) {
	        Predicate<Integer> NumberRange = number -> number >= 10 && number <= 20;
	        System.out.println(NumberRange.test(15));  // true
	    }
	}

