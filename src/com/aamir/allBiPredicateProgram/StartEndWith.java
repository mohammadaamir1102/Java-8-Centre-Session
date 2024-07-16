package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class StartEndWith {

	public static void main(String[] args) {
		BiPredicate<String, String> endsWith = (str1, secondnum) -> str1.endsWith(secondnum);

		System.out.println(endsWith.test("Aamir Khan", "Abrar Khan"));
		
		if (endsWith.test("Khan Abrar Ahmed", "Ahmed"))
			System.out.println("endWith right String");
		else
			System.out.println("not endWith second String");
	}

}
