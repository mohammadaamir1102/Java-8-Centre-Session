
package com.aamir.moin.Supplier;

import java.util.function.Supplier;

public class SupplierExm5 {
    public static void main(String[] args) {
        Supplier<Integer> supplier=() -> 10;
        System.out.println(supplier.get());
    }
}
