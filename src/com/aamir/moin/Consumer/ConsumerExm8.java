package com.aamir.moin.Consumer;

import java.util.function.Consumer;

public class ConsumerExm8 {
    public static void main(String[] args) {
        Consumer<String> consumer=s-> System.out.println(s.isBlank());
        consumer.accept("asfgh");
    }
}
