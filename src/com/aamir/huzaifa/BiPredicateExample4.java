package com.aamir.huzaifa;
import java.util.function.BiPredicate;
public class BiPredicateExample4 {
	    public static void main(String[] args) {
	        BiPredicate<String, String> contains = (s1, s2) -> s1.contains(s2);

	        System.out.println(contains.test("hello world", "world")); 
	        System.out.println(contains.test("hello world", "java")); 
	    }
	}


