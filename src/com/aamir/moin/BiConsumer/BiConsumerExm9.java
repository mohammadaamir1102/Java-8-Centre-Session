package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm9 {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer=(s1, s2) -> System.out.println(s1.length()+s2.length());
        biConsumer.accept("Abdul","Faiz");
    }
}
