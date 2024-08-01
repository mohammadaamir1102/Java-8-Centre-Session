package Predicate;

import java.util.function.Predicate;

public class PredicateCombiningPredicatesWithAnd {
	public static void main(String[] args) {
		Predicate<Integer> between10And20 = num -> num >= 10 && num <= 20;
		Predicate<Integer> isEven = num -> num % 2 == 0;
		Predicate<Integer> evenAndBetweenPredicate = between10And20.and(isEven);
		System.out.println(evenAndBetweenPredicate.test(12));//t
		System.out.println(isEven.test(2));//t
		System.out.println(between10And20.test(19));//f
	}
}
