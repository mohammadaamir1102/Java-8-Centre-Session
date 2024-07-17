package com.aamir.Tufail;

import java.util.List;
import java.util.function.Predicate;

public class IsEmptyListTest5 {
	public static void main(String[] args) {
        Predicate<List<?>> isEmptyList = list -> list.isEmpty();
        System.out.println(isEmptyList.test(List.of(1, 2, 3)));  // false
    }
}
