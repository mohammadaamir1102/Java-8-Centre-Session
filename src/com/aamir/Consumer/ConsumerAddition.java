package com.aamir.Consumer;

import java.util.function.Consumer;

public class ConsumerAddition {
	public static void main(String[] args) {
		Consumer<Integer> con = num -> System.out.println(num + num + 20);
		con.accept(15);
	}
}
