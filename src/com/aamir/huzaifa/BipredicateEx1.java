package com.aamir.huzaifa;

import java.util.function.BiPredicate;

public class BipredicateEx1 {
    public static void main(String[] args) {
        BiPredicate <Integer,Integer> s=(s1,s2)->   s1>s2;

        System.out.println(s.test(4,3));
    }
}
