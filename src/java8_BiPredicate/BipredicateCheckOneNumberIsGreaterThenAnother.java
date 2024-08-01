package java8_BiPredicate;

import java.util.function.BiPredicate;

public class BipredicateCheckOneNumberIsGreaterThenAnother {
public static void main(String[] args) {
	 BiPredicate<Integer, Integer> greaterThan = (num1, num2) -> num1 > num2;
     System.out.println(greaterThan.test(10, 5));   // true
     System.out.println(greaterThan.test(3, 8));    // false
}
}
