package com.aamir.moin.Supplier;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExm4 {
    public static void main(String[] args) {
        Supplier<String> defaultStringSupplier = () -> "Default String";

        Optional<String> optional = Optional.empty();
        String result = optional.orElseGet(defaultStringSupplier);
        System.out.println(result);
    }
}
