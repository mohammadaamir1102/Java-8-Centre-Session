package java_8Predicate;

import java.util.function.Predicate;

public class PredicateCheckStringLengthGraterOrNot {
	public static void main(String[] args) {
		Predicate<String> lengthPredicate = str -> str.length() > 5;
		System.out.println(lengthPredicate.test("dilshad"));
	}

}
