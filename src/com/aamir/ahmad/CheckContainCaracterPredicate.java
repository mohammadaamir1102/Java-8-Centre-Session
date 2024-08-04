package com.aamir.ahmad;

import java.util.function.Predicate;

public class CheckContainCaracterPredicate {

	public static void main(String[] args) {

		Predicate<String> pt = Contain -> Contain.contains("A") || Contain.equalsIgnoreCase(Contain);
		System.out.println(pt.test("ahmad"));
		
		Predicate<String> ps  = item -> item.startsWith("Ah");
		System.out.println(ps.test("Ahmad"));


	}

}
