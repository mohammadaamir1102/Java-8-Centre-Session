package com.aamir.suplier;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerationSupplier {

	public static void main(String[] args) {

		Supplier<Integer> streamGenrartion= () -> (int) (Math.random()*100);
		Stream.generate(streamGenrartion).limit(5).forEach(System.out::println);;
	}

}
