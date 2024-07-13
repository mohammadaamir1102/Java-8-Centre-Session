package com.aamir.faiz;

import java.util.function.BiPredicate;

public class Practice {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate=(hell,hell1)->{
			if (hell>hell1) {
				return true;	
			}
			throw new RuntimeException("Exception:- I am Back!!!.........");
			
		};
		System.out.println(biPredicate.test(0,20));
	}

}
