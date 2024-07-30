package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class StringLengthAreEqual {
    public static void main(String[] args) {
        BiPredicate<String,String> isequalString=(s1,s2)->
         s1.length()==s2.length();

        System.out.println(isequalString.test("abdul","faizq"));
    }
}
