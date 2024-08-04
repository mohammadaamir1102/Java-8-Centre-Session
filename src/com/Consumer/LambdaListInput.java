package com.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaListInput {

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Ahamd", "Husain","Khan ");
        Consumer<String> consumer = element -> System.out.println(element);
        inputList.forEach(consumer);
    }
}
