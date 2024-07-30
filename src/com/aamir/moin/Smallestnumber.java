package com.aamir.moin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Smallestnumber {
    public static void main(String[] args) {
        int a[]={12,36,15,67,45};
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("smallest number is :"+min);



    }
}
