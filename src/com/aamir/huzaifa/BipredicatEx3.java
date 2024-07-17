package com.aamir.huzaifa;

import java.util.function.BiPredicate;

public class BipredicatEx3 {
	    public static void main(String[] args) {
	        BiPredicate<String, String> areLengthsEqual = (s1, s2) -> s1.length() == s2.length();

	        System.out.println(areLengthsEqual.test("hello", "worl")); 
	        System.out.println(areLengthsEqual.test("hello", "java")); 
	    }
	}



