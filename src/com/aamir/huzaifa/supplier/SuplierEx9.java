package com.aamir.huzaifa.supplier;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class SuplierEx9 {
    public static void main(String[] args) {

                Supplier<List<String>> listSupplier = () -> Arrays.asList("A", "B", "C", "D");


                List<String> list = listSupplier.get();
                int size = list.size();
                System.out.println("Size of the list: " + size);
    }
}



