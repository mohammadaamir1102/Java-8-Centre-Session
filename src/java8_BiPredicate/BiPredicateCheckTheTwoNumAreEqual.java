package java8_BiPredicate;
import java.util.function.BiPredicate;

public class BiPredicateCheckTheTwoNumAreEqual {
public static void main(String[] args) {
	 BiPredicate<Integer, Integer> isEqual = (num1, num2) -> num1.equals(num2);
     System.out.println(isEqual.test(10, 10));  // true
     System.out.println(isEqual.test(5, 8));    // false
}
}
