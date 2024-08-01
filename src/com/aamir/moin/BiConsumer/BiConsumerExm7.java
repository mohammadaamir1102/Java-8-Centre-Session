package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm7 {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=(name, age) -> System.out.println(name+"  is "+age+"  "+ "years old.");
        biConsumer.accept("Faiz",10);
    }
}
