package com.aamir.Tufail;

import java.util.function.Predicate;

	public class IsEmpthyStringTest {
	    public static void main(String[] args) {
	        Predicate<String> isEmpty = str -> str.isEmpty();
	        System.out.println(isEmpty.test("hello"));  //false
	       
	    }
	}


