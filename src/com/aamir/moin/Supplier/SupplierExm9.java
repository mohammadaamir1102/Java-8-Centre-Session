package com.aamir.moin.Supplier;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierExm9 {
    public static void main(String[] args) {
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        System.out.println(time);

    }
}
