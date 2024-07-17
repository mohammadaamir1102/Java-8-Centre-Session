package com.aamir.Tufail;

import java.util.function.Predicate;

     public class StringTest6 {
	    public static void main(String[] args) {
	      Predicate<String> Item = item -> item.contains("Hello");
	       System.out.println(Item.test("Hello, world!"));  // true
	    }
	}

