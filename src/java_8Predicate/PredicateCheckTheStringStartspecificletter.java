package java_8Predicate;

import java.util.function.Predicate;

public class PredicateCheckTheStringStartspecificletter {
public static void main(String[] args) {
	Predicate<String> startsWithPredicate = str -> str.startsWith("a");
    System.out.println(startsWithPredicate.test("ailshad"));
}
}
