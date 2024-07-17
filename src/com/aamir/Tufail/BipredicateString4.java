package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BipredicateString4 {
  public static void main(String[] args) {
    BiPredicate<String, String>str=(str1,str2)->str1.contains(str2);
    System.out.println(str.test("hiibye", "bye"));
}
}
