package com.aamir.huzaifa.Consumer;
import java.util.function.BiConsumer;
import java.util.Map;
import java.util.HashMap;

public class BiconsumerEx4 {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("Alice", 30);
            map.put("Bob", 25);

            BiConsumer<String, Integer> printEntry = (key, value) -> System.out.println(key + ": " + value);
            map.forEach(printEntry);
        }
    }


