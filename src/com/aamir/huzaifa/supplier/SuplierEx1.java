package com.aamir.huzaifa.supplier;

import java.util.function.Supplier;

public class SuplierEx1 {//
    public static void main(String[] args) {     //
        Supplier <String> suplier=()->  "Hello world";
        System.out.println(suplier.get());
    }
}
