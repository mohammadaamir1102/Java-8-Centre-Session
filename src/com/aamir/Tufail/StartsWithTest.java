package com.aamir.Tufail;

import java.util.function.Predicate;

	public class StartsWithTest {
	    public static void main(String[] args) {
	        Predicate<String> startsWithH = str -> str.startsWith("H");
	        System.out.println(startsWithH.test("Hello"));  // true
	  
	    }
	}


