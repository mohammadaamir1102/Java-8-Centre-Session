package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BipredcateTest10 {
public static void main(String[] args) {
	BiPredicate<Integer, Integer>num=(items1,items2)->items1<items2;
	System.out.println(num.test(10, 20));
}
}
