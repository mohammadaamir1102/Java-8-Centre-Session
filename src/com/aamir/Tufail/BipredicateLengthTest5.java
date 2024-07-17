package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BipredicateLengthTest5 {
	public static void main(String[] args) {
		BiPredicate<String, String>items=(str1,str2)->str1.length()==str2.length();
		System.out.println(items.test("ayazz", "Tufail"));
	}

}
