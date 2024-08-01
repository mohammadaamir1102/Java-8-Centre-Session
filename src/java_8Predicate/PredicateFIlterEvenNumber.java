package java_8Predicate;

import java.util.function.Predicate;

public class PredicateFIlterEvenNumber {
	public static void main(String[] args) {
		Predicate<Integer> evenPredicate = num -> num % 2 == 0;
		System.out.println(evenPredicate.test(13));

	}

}
