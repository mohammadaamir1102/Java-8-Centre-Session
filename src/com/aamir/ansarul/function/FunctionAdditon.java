package com.aamir.ansarul.function;

import java.util.function.Function;

public class FunctionAdditon {

	public static void main(String[] args) {
    Function<Integer,Integer> function=(add) -> add+add;
    System.out.println(" By Abu Bakar"+function.apply(20));
	}

}
