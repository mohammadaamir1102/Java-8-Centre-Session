package com.aamir.moin.Predicate;

import java.util.function.Predicate;

public class PasswordValidator {
    public static void main(String[] args) {
        Predicate<String> passwordvalidator=pswd->pswd.length()>8 &&
                pswd.matches(".*[a-z].*") &&
                pswd.matches(".*[A-Z].*") &&
                pswd.matches(".*\\d.*") &&
                pswd.matches(".*[@#$%^&+=].*");
        System.out.println(passwordvalidator.test("Abdul@987"));
    }
}
