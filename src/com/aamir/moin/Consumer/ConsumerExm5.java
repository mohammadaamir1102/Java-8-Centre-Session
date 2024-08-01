package com.aamir.moin.Consumer;

import java.util.function.Consumer;

public class ConsumerExm5 {
    public static void main(String[] args) {
        Consumer<String> consumer=string -> System.out.println(string.charAt(3));
        consumer.accept("asdfgh");
    }
}
