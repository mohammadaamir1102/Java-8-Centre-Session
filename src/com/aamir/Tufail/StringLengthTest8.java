package com.aamir.Tufail;

import java.util.function.Predicate;

       
 public class StringLengthTest8 {
	 public static void main(String[] args) {
		 Predicate<String> ItemLength = item -> item.length() > 5;
	        System.out.println(ItemLength.test("Tufail")); //true
	    }
	}

	


