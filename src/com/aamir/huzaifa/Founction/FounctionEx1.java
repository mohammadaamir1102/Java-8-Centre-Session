package com.aamir.huzaifa.Founction;
import java.util.function.Function;
public class FounctionEx1 {
    public static void main(String[] args) {
       Function <Integer,Integer> sp=  (a)-> a;

        System.out.println(sp.apply(4));
    }
}
