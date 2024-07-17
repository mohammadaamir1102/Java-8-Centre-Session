package com.aamir.huzaifa;
import java.util.function.Predicate;

public class UsingingAndOperator {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isGreaterThanTen = num -> num > 10;
        Predicate<Integer> isEvenAndGreaterThanTen = isEven.and(isGreaterThanTen);
        System.out.println(isEvenAndGreaterThanTen.test(8));   //   
        System.out.println(isEvenAndGreaterThanTen.test(12));  //    
        System.out.println(isEvenAndGreaterThanTen.test(7));   //   
    }
}
