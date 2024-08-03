package com.aamir.huzaifa.Consumer;
import java.util.function.BiConsumer;
public class BiconsumerEx5 {
    public static void main(String[] args) {
    BiConsumer<String, Integer> printGrade = (name, age) -> {
        String grade = (age < 20) ? "Young" : "Adult";
        System.out.println(name + " is an " + grade + ".");
    };
                printGrade.accept("John",18);
                printGrade.accept("Mary",22);
}     }



