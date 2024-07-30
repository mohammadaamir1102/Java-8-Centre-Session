package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class BipredicateOr {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> greater=(x, y)->x>y;
        BiPredicate<Integer,Integer> equal=(x,y)->x==y;
        boolean greaterAndEqual=greater.or(equal).test(25,12);
        System.out.println(greaterAndEqual);
    }
}
