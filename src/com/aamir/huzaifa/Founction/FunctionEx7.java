package com.aamir.huzaifa.Founction;
import java.util.function.Function;
public class FunctionEx7 {
        public static void main(String[] args) {
            Function<Double, Double> sq = x -> Math.sqrt(x);
            System.out.println(sq.apply(16.0));
        }
    }


