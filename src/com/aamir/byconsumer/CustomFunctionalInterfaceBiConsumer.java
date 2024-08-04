package com.aamir.byconsumer;

import java.util.function.BiConsumer;

@FunctionalInterface
interface CustomBiConsumer<T, U> extends BiConsumer<T, U> {
    void accept(T t, U u);
}

public class CustomFunctionalInterfaceBiConsumer {
    public static void main(String[] args) {
        CustomBiConsumer<String, Integer> customBiConsumer = (s, i) -> System.out.println(s + ": " + i);
        customBiConsumer.accept("Custom Key", 456);
    }
}