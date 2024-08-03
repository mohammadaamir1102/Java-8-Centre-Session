package com.aamir.huzaifa.supplier;

import java.util.function.Supplier;

public class SuplierEx7 {
    public static void main(String[] args) {
        Supplier <String> getlen=()->  "Mohammad";
        System.out.println(getlen.get().length());
    }
}
