package com.aamir.huzaifa;

import java.util.function.Predicate;

public class CheakStringisEmpty {
	
	 public static void main(String[] args) {
	   Predicate<String> isEmpty = String::isEmpty;

	        System.out.println(isEmpty.test(""));    // true
	        System.out.println(isEmpty.test("abc")); // false
	    }
	}



