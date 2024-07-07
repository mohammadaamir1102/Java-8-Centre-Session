package com.aamir.sufiyan;

import java.util.function.Predicate;

public class TradiPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer Integer) {
		if (Integer % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = new TradiPredicate();
		System.out.println(predicate.test(15));

	}

}
