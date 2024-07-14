package com.aamir.mushahid;

import java.util.function.BiPredicate;

public class TwoStringLengthSameOrNot {
public static void main(String[] args) {
	
	BiPredicate<String, String> listLengthCompare =(str1,str2) -> str1.length()== str2.length();
	System.out.println(listLengthCompare.test("Mushahid", "Abrar"));
	
}
}
