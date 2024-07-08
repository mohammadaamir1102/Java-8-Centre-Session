package com.aamir.Tufail;

import java.util.function.Predicate;

public class Bahubali implements Predicate<Integer> {
@Override
public boolean test(Integer t) {
	if(t %2==0) {
		
	
	return true ;
	} return false;
}
public static void main(String[] args) {
	Predicate<Integer> iPredicate = new Bahubali();
	System.out.println(iPredicate.test(12));
}
}
