package com.aamir.moin.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExm2 {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomIntSupplier = () -> random.nextInt(100);

        System.out.println(randomIntSupplier.get());
        System.out.println(randomIntSupplier.get());
        System.out.println(randomIntSupplier.get());
    }
}
