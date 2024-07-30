package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class SumOfNumIsEven {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isSumEven=(num1,num2)->(num1+num2)%2==0;
        System.out.println(isSumEven.test(5,7));
    }
}
