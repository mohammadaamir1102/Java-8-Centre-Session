package com.aamir.huzaifa.supplier;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class SuplierEx3 {
        public static void main(String[] args) {
            Supplier<List<String>> listSupplier = () -> Arrays.asList("Apple", "Banana", "Cherry");
           // List<String> fruits = listSupplier.get();
            System.out.println(listSupplier.get());
        }
    }

