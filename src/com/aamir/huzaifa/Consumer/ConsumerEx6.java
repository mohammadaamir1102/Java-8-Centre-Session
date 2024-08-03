package com.aamir.huzaifa.Consumer;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

public class ConsumerEx6 {
        public static void main(String[] args) {
            List<String> items = new ArrayList<>(Arrays.asList("Item1", "Item2", "Item3"));

            Consumer<String> customProcess = item -> System.out.println("Processing: " + item.toUpperCase());
            items.forEach(customProcess);
        }
    }


