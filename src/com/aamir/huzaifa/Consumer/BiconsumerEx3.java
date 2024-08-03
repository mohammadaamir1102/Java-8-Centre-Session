package com.aamir.huzaifa.Consumer;
import java.util.function.BiConsumer;
public class BiconsumerEx3 {
        public static void main(String[] args) {
            BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name + " is " + age + " years old.");
            printDetails.accept("Alice", 30);
        }
    }


