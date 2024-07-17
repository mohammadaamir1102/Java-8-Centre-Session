package com.aamir.mushahid.BiPredicate;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class ArrayContentCheck {
	public static void main(String[] args) {
		BiPredicate<int[], int[]> arraysEqual = (arr1, arr2) -> Arrays.equals(arr1, arr2);

		int[] array1 = { 31, 03, 2006 };
		int[] array2 = { 31, 03, 2010 };
		int[] array3 = { 31, 03, 2006 };

		System.out.println("Are array1 and array2 equal? " + arraysEqual.test(array1, array2));
		System.out.println("Are array1 and array3 equal? " + arraysEqual.test(array1, array3));
	}
}
