package com.aamir.moin.Function;

import java.util.function.Function;

class FunctionExm10{
    public static void main(String[] args) {
        Function<String,String> function= s->s.concat(s);
        System.out.println(function.apply("abdul"));
    }
}


