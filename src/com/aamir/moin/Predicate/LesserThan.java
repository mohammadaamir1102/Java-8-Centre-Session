package com.aamir.moin.Predicate;

import java.util.function.Predicate;

public class LesserThan {
    public static void main(String[] args) {


        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));
    }
}
