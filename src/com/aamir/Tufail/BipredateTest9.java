package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BipredateTest9 {
public static void main(String[] args) {
	BiPredicate<Integer, Integer>items=(number1,number2)->number1==number2;
	System.out.println(items.test(10, 10));//true
}
}
