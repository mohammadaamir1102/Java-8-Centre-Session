package com.aamir.faiz;

import java.util.function.Consumer;

public class ConsumerTradi implements Consumer<String> {
	public static void main(String[] args) {
		Consumer<String> consumer = new ConsumerTradi();
		consumer.accept("Faiz Khan");
	}

	@Override
	public void accept(String t) {
		System.out.println("OUTPUT : " + t);
	}
}
