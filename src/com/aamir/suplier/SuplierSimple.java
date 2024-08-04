package com.aamir.suplier;

import java.util.function.Supplier;

public class SuplierSimple {

	public static void main(String[] args) {
		
		  Supplier<String> suplier= () -> "hello ABrar"; 
		  System.out.println(suplier.get());
	}
}
