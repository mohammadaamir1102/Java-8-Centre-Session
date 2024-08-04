package com.aamir.suplier;

import java.util.function.Supplier;

@FunctionalInterface
interface CustomSupplier<T> extends Supplier<T> {
	T get();
}

public class CustomFunctionalInterfaceSupplier {

	public static void main(String[] args) {

		Supplier<String> customSupplier= () -> "created Custom Supplier interface";
		System.out.println(customSupplier.get());
	}

}
