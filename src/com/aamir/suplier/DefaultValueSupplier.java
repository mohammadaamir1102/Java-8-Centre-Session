package com.aamir.suplier;

import java.util.function.Supplier;

public class DefaultValueSupplier {

	public static void main(String[] args) {

		Supplier<String> defaultValue= () -> "hello java 8";
		System.out.println(defaultValue.get());
	}

}
