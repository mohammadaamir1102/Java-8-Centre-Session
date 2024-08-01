package com.aamir.moin.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExm3 {
    public static void main(String[] args) {
        Supplier<List<String>> listSupplier = () -> new ArrayList<>();

        List<String> list = listSupplier.get();
        list.add("Abdul");
        list.add("Faiz");
        list.add("Usman");


        list.forEach(System.out::println);
    }
}
