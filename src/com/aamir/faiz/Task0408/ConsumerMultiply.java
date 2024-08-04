package com.aamir.faiz.Task0408;

import java.util.function.Consumer;

public class ConsumerMultiply {
	public static void main(String[] args) {
		Consumer<Integer> con = mult -> System.out.println(mult * mult);
		con.accept(4);
	}
}
