package com.aamir.byconsumer;

import java.util.function.BiConsumer;

public class DataValidationBiConsumer {

	public static void main(String[] args) {
		BiConsumer<String, Integer> validation = (time, value) -> {
			if (time == null || time.isEmpty() || value < 0)
				System.out.println("invalid value....");
			else
				System.out.println("valid number");

		};
		validation.accept("ABrar", 123);
		validation.accept("khan", 191);
	}

}
