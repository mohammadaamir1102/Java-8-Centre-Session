package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class EligibleForVote {
	public static void main(String[] args) {
		BiPredicate<String, Integer> isEligible = (name, age) -> age >= 18;

		System.out.println("Mushahid Eligible for Vote? " + isEligible.test("Mushahid", 18));
		System.out.println("Mushahib Eligible for Vote? " + isEligible.test("Mushahib", 17));
	}
}
