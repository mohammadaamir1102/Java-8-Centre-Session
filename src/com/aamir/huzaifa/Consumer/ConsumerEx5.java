package com.aamir.huzaifa.Consumer;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerEx5 {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            Consumer<Integer> doubleConsumer = number -> System.out.println(number * 2);
            numbers.forEach(doubleConsumer);
        }
    }

