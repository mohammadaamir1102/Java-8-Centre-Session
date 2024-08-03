package com.aamir.huzaifa.Consumer;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
public class ConsumerEx2 {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            Consumer<Integer> incrementConsumer = number -> {
                int incremented = number + 1;
                System.out.println(incremented);
            };
            numbers.forEach(incrementConsumer);
        }
    }


