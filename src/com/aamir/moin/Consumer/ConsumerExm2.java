package com.aamir.moin.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExm2 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Goa");
        cities.add("Pune");

        Consumer<String> printConsumer= System.out::println;
       // cities.forEach(printConsumer);
        printConsumer.accept(cities.toString());
    }
}
