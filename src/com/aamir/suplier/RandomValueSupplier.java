package com.aamir.suplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomValueSupplier {

	public static void main(String[] args) {

		Random random= new Random();
		Supplier<Integer> randomSupplier= random::nextInt;
		System.out.println(randomSupplier.get());
	}

}
