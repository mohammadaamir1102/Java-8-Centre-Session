package com.aamir.faiz.Task1407;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfAPersonIsAbleToVote {

	public static void main(String[] args) {
		BiPredicate<String, Integer> canVoteOrNot = (name, age) -> age >= 18;
		System.out.println(canVoteOrNot.test("faiz", 14));
	}

}
