package com.aamir.mushahid;

import java.util.function.Predicate;

public class TradiPredi implements Predicate< Integer> {
	public boolean test(Integer integer) {
		if (integer % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Predicate<Integer> pre = new TradiPredi();
		System.out.println(pre.test(3));
	}
}
