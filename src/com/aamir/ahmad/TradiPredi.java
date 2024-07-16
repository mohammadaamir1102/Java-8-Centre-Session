package com.aamir.ahmad;

import java.util.function.Predicate;

public class TradiPredi implements Predicate<Integer> {

	@Override
	public boolean test(Integer integer) {
		if (integer % 2==0) {
			return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		Predicate<Integer> pre=new TradiPredi();
		System.out.println(pre.test(10));

	}


}