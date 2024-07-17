package com.aamir.huzaifa;


import java.util.List;
import java.util.function.Predicate;


public class Getopnumber {
	public static void main(String[] args) {
		List<Integer> odd =getNumber();
		Predicate<Integer> Odd =Ch-> Ch%2!=0;
		System.out.println(Odd.test(4));
		
	}
	public static List<Integer> getNumber(){
		return List.of(5);
	}
	

}
