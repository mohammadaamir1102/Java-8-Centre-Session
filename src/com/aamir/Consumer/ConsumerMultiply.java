package com.aamir.Consumer;

import java.util.function.Consumer;

public class ConsumerMultiply {
	public static void main(String[] args) {
		Consumer<Integer> con = mult -> System.out.println(mult * mult);
		con.accept(4);
	}
}
