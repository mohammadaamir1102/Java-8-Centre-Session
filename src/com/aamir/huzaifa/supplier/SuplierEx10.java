package com.aamir.huzaifa.supplier;

import java.util.function.Supplier;

public class SuplierEx10 {
    public static void main(String[] args) {
        Supplier <Integer> multi=()-> 5*5;
        System.out.println(multi.get());


    }
}
