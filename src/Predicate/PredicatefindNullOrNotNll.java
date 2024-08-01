package Predicate;

import java.util.function.Predicate;

public class PredicatefindNullOrNotNll {
public static void main(String[] args) {
	Predicate<Object> nonNullPredicate = obj -> obj != null;
    System.out.println(nonNullPredicate.test(null));
}
}
