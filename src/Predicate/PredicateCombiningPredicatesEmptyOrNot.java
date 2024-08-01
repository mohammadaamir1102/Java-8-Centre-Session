package Predicate;

import java.util.function.Predicate;

public class PredicateCombiningPredicatesEmptyOrNot {
public static void main(String[] args) {
	Predicate<String> EmptyPredicate = str -> str.isEmpty();
	Predicate<String> notEmptyPredicate = str -> !str.isEmpty();
    System.out.println(EmptyPredicate.test("g"));
    System.out.println(notEmptyPredicate.test("g"));
    
}
}
