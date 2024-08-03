package com.aamir.huzaifa.supplier;

import java.util.Arrays;
import java.util.function.Supplier;

public class SuplierEx5 {
    public static void main(String[] args) {
        Supplier <String[]> findlength=()-> new String[]{"Mohammad","huzaifa","Subhanallah"};
        System.out.println(findlength.get().length);
    }
}
