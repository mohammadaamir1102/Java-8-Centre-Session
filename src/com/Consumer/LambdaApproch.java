package com.Consumer;

import java.util.function.Consumer;


public class LambdaApproch {

	public static void main(String[] args) {
		Consumer<String> consumer= (Variable)->System.out.println(Variable);
		consumer.accept("Ahamd");
	}
}
