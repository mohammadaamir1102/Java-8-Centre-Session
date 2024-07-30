package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class BipredicateAnd {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> greater=(x,y)->x>y;
        BiPredicate<Integer,Integer> equal=(x,y)->x==y;
        boolean greaterAndEqual=greater.and(equal).test(15,20);
        System.out.println(greaterAndEqual);
    }
}
