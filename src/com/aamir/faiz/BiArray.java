package com.aamir.faiz;

import java.util.function.BiPredicate;

public class BiArray {

	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4};
		Integer arr2[]= {3,4,5,6};
		BiPredicate<Integer[], Integer[]> biPredicate=(arr3,arr4)-> arr.length==arr2.length;
		System.out.println(biPredicate.test(arr, arr2));

	}

}
