package com.aamir.huzaifa.Founction;
import java.util.function.Function;
public class FunctonEx3
{
        public static void main(String[] args) {
            Function<String, Integer> stringLength = s -> s.length();
            System.out.println(stringLength.apply("Hello, World!"));
        }
    }


