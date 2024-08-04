package com.aamir.PredicateAndBiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfAPersonIsAbleToVote {

	public static void main(String[] args) {
		BiPredicate<String, Integer> canVoteOrNot = (name, age) -> age >= 18;
		System.out.println(canVoteOrNot.test("faiz", 14));
	}

}
