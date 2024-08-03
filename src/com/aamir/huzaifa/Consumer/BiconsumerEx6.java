package com.aamir.huzaifa.Consumer;

import java.util.function.BiConsumer;

public class BiconsumerEx6 {

        public static void main(String[] args) {
            BiConsumer<String, Integer> formatOutput = (name, score) -> System.out.printf("%s scored %d points.%n", name, score);
            formatOutput.accept("Tom", 85);
        }
    }


