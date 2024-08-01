package java8_BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateStringContainsAnotherString {
	public static void main(String[] args) {
		BiPredicate<String, String> contains = (str1, str2) -> str1.contains(str2);
		System.out.println(contains.test("hello world", "world")); // true
		System.out.println(contains.test("java programming", "python")); // false
	}
}
