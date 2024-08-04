package com.aamir.suplier;

import java.util.function.Supplier;

public class MethodReferenceSupplier {

	public static void main(String[] args) {

		  Supplier<Double> supplier = Math::random;
	        System.out.println(supplier.get());
	}

}
