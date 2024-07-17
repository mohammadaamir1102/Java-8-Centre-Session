package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BipredcateOdd8 {
public static void main(String[] args) {
	BiPredicate<Integer, Integer>number=(num1,num2)->num1%num2!=0;
	System.out.println(number.test(10, 5));
}
}
