package com.aamir.ansarul.bifunction;

import java.util.function.BiFunction;

public class BiFunctionString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BiFunction<String, Integer, String> biFunction=(a,s) -> a.toLowerCase(); 
      System.out.println(biFunction.apply("Abubakar ", 2));
	}

}
