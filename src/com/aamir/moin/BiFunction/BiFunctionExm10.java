package com.aamir.moin.BiFunction;

import java.util.function.BinaryOperator;

public class BiFunctionExm10 {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=(n1,n2)->n1.compareTo(n2);
        System.out.println(binaryOperator.apply(16,9));
    }
}
