package com.aamir.ahmad;

import java.util.function.Predicate;

public class Predi2 implements Predicate<Integer> {

	public static void main(String[] args) {
	Predicate<Integer> predi2 = new	Predi2();
	System.out.println(predi2.test(11));

	}

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		}
		return false;
	}
}
