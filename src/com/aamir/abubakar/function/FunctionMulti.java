package com.aamir.abubakar.function;

import java.util.function.Function;

public class FunctionMulti {

	public static void main(String[] args) {
  Function<Integer,Integer> function=mul -> mul*6;
  System.out.println(function.apply(80));
	}

}
