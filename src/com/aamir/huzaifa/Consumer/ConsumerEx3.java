package com.aamir.huzaifa.Consumer;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ConsumerEx3 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
            Consumer<String> appendConsumer = s -> list.add(s);

            appendConsumer.accept("Four");
            System.out.println(list);
        }
    }


