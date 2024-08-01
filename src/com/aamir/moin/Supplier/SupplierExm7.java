package com.aamir.moin.Supplier;

import java.util.function.Supplier;

public class SupplierExm7 {
    public static void main(String[] args) {
        Supplier<String> supplier=() -> "Abdul ".concat("moin");
        System.out.println(supplier.get());
    }
}
