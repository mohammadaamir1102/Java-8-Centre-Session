package com.aamir.moin.Supplier;

import java.util.function.Supplier;

public class SupplierExm1 {
    public static void main(String[] args) {
        Supplier<String> supplier=() -> "Hello world";
        System.out.println(supplier.get());

    }
}
