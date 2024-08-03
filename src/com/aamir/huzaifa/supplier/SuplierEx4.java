package com.aamir.huzaifa.supplier;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuplierEx4 {
        public static void main(String[] args) {

            Supplier<List<Integer>> intArray=()-> Arrays.asList(1,2,3,4);

            System.out.println("Integer List: " + intArray.get());
        }
    }


