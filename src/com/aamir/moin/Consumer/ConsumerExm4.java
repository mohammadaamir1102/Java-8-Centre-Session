package com.aamir.moin.Consumer;

import java.util.function.Consumer;

public class ConsumerExm4 {
    public static void main(String[] args) {
        Consumer<Integer> consumer=a-> System.out.println(a+a);
        consumer.accept(10);
    }
}
