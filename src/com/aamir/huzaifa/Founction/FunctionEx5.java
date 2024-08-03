package com.aamir.huzaifa.Founction;
import java.util.function.Function;
public class FunctionEx5 {

        public static void main(String[] args) {
            Function<Integer, Boolean> isEven = x -> x % 2 == 0;
            System.out.println(isEven.apply(4));
            System.out.println(isEven.apply(7));
        }


}
