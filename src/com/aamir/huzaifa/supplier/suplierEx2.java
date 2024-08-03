package com.aamir.huzaifa.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class suplierEx2 {
    public static void main(String[] args) {
        Supplier <Integer> supplier1=()-> new Random().nextInt(100);
        System.out.println(supplier1.get());
    }
}
