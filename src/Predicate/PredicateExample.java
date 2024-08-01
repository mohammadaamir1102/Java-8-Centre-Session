package Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
     
	public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate to filter even numbers
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;

        // Predicate to filter numbers greater than 5
        Predicate<Integer> greaterThan5Predicate = num -> num > 5;

        // Applying predicates using streams
        System.out.println("Even numbers:");
        numbers.stream()
                .filter(evenPredicate)
                .forEach(System.out::println);

        System.out.println("\nNumbers greater than 5:");
        numbers.stream()
                .filter(greaterThan5Predicate)
                .forEach(System.out::println);

        System.out.println("\nNumbers greater than 5 and even:");
        numbers.stream()
                .filter(greaterThan5Predicate.and(evenPredicate))
                .forEach(System.out::println);
    }

}
