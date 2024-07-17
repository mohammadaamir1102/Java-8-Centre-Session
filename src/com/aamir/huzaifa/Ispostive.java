package com.aamir.huzaifa;
import java.util.function.Predicate;
interface MyPredicate<T> {
	boolean test(T t);
}
public class Ispostive {
    public static void main(String[] args) {
        // Using Java's built-in Predicate
        Predicate<Integer> isPositive = num -> num > 0;

        System.out.println(isPositive.test(10)); // Output: true
        System.out.println(isPositive.test(-5)); // Output: false

        // Using custom Predicate interface
        MyPredicate<String> isLong = str -> str.length() > 5;

        System.out.println(isLong.test("Hello, world!")); // Output: true
        System.out.println(isLong.test("Java")); // Output: false
    }
}
