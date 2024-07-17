package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BiPredicateEqualsMethod {
public static void main(String[] args) {
	BiPredicate<Integer, Integer>addition=(number1,number2)->number1.equals(number2);
	System.out.println(addition.test(10, 20)); //false
}
}
