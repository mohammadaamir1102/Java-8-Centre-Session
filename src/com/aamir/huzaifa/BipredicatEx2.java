package com.aamir.huzaifa;

import java.util.function.BiPredicate;

public class BipredicatEx2 {
    public static void main(String[] args) {
        BiPredicate <Float,Float> m=(l1,l2)->  l1%l2==0;
        System.out.println(m.test(7.0f,2.0f));
    }
}
