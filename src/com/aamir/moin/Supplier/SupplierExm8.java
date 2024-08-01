package com.aamir.moin.Supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExm8 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Abdul");
        names.add("Faiz");
        names.add("wahid");
        names.add("Meraj");

        Supplier<String> supplier=() -> names.toString();
        System.out.println(supplier.get());
    }
}
