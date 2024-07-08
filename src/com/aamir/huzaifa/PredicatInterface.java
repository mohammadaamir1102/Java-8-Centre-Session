package com.aamir.huzaifa;

import java.util.function.Predicate;

public class PredicatInterface implements Predicate<Integer>{
	public boolean test(Integer integer) {
		if(integer %2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
	Predicate<Integer> sPredicate=new PredicatInterface();
	System.out.println(sPredicate.test(10));
	}
	
 
}

