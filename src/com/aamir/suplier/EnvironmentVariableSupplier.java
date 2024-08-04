package com.aamir.suplier;

import java.util.function.Supplier;

public class EnvironmentVariableSupplier {

	public static void main(String[] args) {

		Supplier<String> envSupplier = () -> System.getenv("JAVA_HOME");
		System.out.println(envSupplier.get());
	}

}
