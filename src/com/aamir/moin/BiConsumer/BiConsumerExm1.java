package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm1 {
    public static void main(String[] args) {
        BiConsumer<String,String> consumer= (s1,s2) -> System.out.println(s1+"  "+s2) ;
        consumer.accept("hello","world");
    }
}
