package com.aamir.huzaifa.supplier;

import java.util.function.Supplier;

public class SuplierEx6 {
    public static void main(String[] args) {
        Supplier <int[]> findlength=()-> new int[]{1,2,3,4,5};
        System.out.println(findlength.get().length);
    }
}
