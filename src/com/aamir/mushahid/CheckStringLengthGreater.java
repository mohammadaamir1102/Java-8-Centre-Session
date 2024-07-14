package com.aamir.mushahid;

import java.util.function.Predicate;

public class CheckStringLengthGreater {
public static void main(String[] args) {
	Predicate<String> output =item -> item.length() > 5;
	System.out.println(output.test("Mushahid Ahmad"));
}
}
