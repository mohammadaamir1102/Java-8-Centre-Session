package com.aamir.Consumer;

import java.util.function.Consumer;

public class ConsumerNumberIncrement {
	public static void main(String[] args) {
		Consumer<Integer> con = num -> System.out.println(++num);
		con.accept(5);
	}
}
