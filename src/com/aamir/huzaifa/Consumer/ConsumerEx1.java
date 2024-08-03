package com.aamir.huzaifa.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

            Consumer<String> printConsumer = name -> System.out.println(name);
            names.forEach(printConsumer);
        }
    }


