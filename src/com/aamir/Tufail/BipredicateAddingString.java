package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BipredicateAddingString {
	public static void main(String[] args) {
	BiPredicate<String, String>items=(str1,str2)->str1.startsWith(str2);
	System.out.println(items.test("hii", "khan"));
	}

}
