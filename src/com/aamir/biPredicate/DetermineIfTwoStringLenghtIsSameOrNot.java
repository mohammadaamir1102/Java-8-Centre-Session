package com.aamir.biPredicate;

import java.util.function.BiPredicate;

public class DetermineIfTwoStringLenghtIsSameOrNot {
    public static void main(String[] args) {

        /*

        5
        * */
//                                                                         5           ==      4
        BiPredicate<String,String> listlengthComapre = (str1, str2) -> str1.length() == str2.length();
        System.out.println(listlengthComapre.test("Aamir","khan"));

    }
}
