package com.aamir.moin.Supplier;

import java.util.function.Supplier;

public class SupplierExm6 {
    public static void main(String[] args) {
        Supplier<Integer> supplier=() -> 10+10;
        System.out.println(supplier.get());
    }
}
