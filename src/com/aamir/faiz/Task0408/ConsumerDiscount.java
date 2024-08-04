package com.aamir.faiz.Task0408;

import java.util.function.Consumer;

public class ConsumerDiscount {
	public static void main(String[] args) {
		Consumer<Double> applyDiscount = price -> System.out.println("Discounted Price: " + (price * 0.5));
		applyDiscount.accept(100.0);
	}
}
