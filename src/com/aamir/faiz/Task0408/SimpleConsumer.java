package com.aamir.faiz.Task0408;

import java.util.function.Consumer;

public class SimpleConsumer {
	public static void main(String[] args) {
		Consumer<String> con = massage -> System.out.println(massage);
		con.accept("I am consumer....");
	}
}