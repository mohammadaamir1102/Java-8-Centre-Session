package com.aamir.predicate;

import java.util.function.Predicate;

public class VerifyIfACharacterIsUpperCase {
    public static void main(String[] args) {
        Predicate<Character> output = Character::isUpperCase;
        System.out.println(output.test('A'));
    }
}
