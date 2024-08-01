package com.aamir.moin.Supplier;

import java.util.function.Supplier;

public class SupplierExm10 {
    public static void main(String[] args) {
        Supplier<Integer> supplier=() -> 20/5;
        System.out.println(supplier.get());
    }
}
