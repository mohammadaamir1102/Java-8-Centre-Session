package BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateCheckTheStringLength {
public static void main(String[] args) {
	 BiPredicate<String, String> sameLength = (str1, str2) -> str1.length() == str2.length();
     System.out.println(sameLength.test("apple", "banana"));   // true
     System.out.println(sameLength.test("java", "python"));    // false
}
}
