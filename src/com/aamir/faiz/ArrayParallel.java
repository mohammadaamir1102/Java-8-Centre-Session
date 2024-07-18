package com.aamir.faiz;

import java.util.Arrays;

public class ArrayParallel {
	public static void main(String[] args) {
		int arr[]= {1,74,3,78,4,2,87};

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	

}
