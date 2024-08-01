package com.aamir.moin.BiConsumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExm2 {

        public static void main(String[] args) {
            Map<String,Integer> cities = new HashMap<>();
            cities.put("Abdul",25);
            cities.put("Faiz",10);
            cities.put("Umair",20);
            cities.put("Faiyaz",30);

            BiConsumer<String,Integer> printConsumer=(name,age)-> System.out.println(name+"  "+age) ;
            cities.forEach(printConsumer);

    }
}
