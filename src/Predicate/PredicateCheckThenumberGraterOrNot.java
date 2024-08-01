package Predicate;

import java.util.function.Predicate;

public class PredicateCheckThenumberGraterOrNot {
public static void main(String[] args) {
	Predicate<Integer> greaterThan100Predicate = num -> num > 100;
    System.out.println(greaterThan100Predicate.test(101));
}
}
