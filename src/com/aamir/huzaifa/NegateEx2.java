package com.aamir.huzaifa;
import java.util.function.Predicate;
public class NegateEx2 {
	public static void main(String[] args) {
	Predicate<String> startsWithA = str -> str.startsWith("A");
	        Predicate<String> doesNotStartWithA = startsWithA.negate();

	        // Test the negated predicate
	        String[] names = {"Alice", "Bob", "Alex", "Charlie", "Anna"};

	        for (String name : names) {
	            if (doesNotStartWithA.test(name)) {
	                System.out.println(name + " does not start with A");
	            } else {
	                System.out.println(name + " starts with A");
	            }
	        }
	    }
	}



