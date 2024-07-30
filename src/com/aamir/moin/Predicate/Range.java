package com.aamir.moin.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Range {
    public static void main(String[] args) {
        Predicate<Integer> range=x -> x > 5 && x < 8;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(range).collect(Collectors.toList());

        System.out.println(collect);
    }
}
