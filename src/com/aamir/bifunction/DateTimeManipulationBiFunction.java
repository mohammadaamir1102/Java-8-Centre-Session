package com.aamir.bifunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;

public class DateTimeManipulationBiFunction {
	public static void main(String[] args) {
		BiFunction<String, String, LocalDate> biFunction = (date, pattern) -> LocalDate.parse(date,
				DateTimeFormatter.ofPattern(pattern));
		System.out.println(biFunction.apply("2024-08-03", "yyyy-MM-dd"));
	}
}
