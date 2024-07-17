package com.aamir.mushahid.Predicate;
import java.util.function.Predicate;

public class StringStartsWithM {
    public static void main(String[] args) {
        Predicate<String> startsWithM = str -> str.startsWith("M");

        System.out.println(startsWithM.test("Mushahid")); 
        System.out.println(startsWithM.test("Mumbai")); 
        System.out.println(startsWithM.test("Sakinka")); 
    }
}
