package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm3 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer=(a,b)-> System.out.println(a*b);
        biConsumer.accept(4,5);
    }
}
