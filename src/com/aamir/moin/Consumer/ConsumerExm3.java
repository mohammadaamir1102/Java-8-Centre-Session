package com.aamir.moin.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExm3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("abdul", "faiz", "waddod");

       Consumer<String> consumer=name -> System.out.println(name.toUpperCase());
      names.forEach(consumer);


    }
}
