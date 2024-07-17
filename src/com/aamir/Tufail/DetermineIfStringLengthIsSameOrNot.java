package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class DetermineIfStringLengthIsSameOrNot {
public static void main(String[] args) {
	BiPredicate<String, String>ListLengthCompare=(str1,str2)->str1.length()==str2.length();
	System.out.println(ListLengthCompare.test("khann", "khan"));
}
}
