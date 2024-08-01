package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm10 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer=(i1, i2) -> System.out.println(i1.compareTo(i2));
        biConsumer.accept(5,9);
    }
}
