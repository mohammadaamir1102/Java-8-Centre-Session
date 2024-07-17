package com.aamir.Tufail;
import java.util.function.Predicate;
public class Predicate2CompareString {
	public static void main(String[] args) {
        Predicate<Character> output = ch -> Character.isLowerCase(ch);
        String testString = "";
        
        for (char ch : testString.toCharArray()) {
            if (output.test(ch)) {
                System.out.println(ch);
            } else {
                System.out.println(ch);
            }
        }
    }
}



