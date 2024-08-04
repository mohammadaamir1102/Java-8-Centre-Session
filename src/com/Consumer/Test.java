package com.Consumer;

import java.util.function.Consumer;

public class Test implements Consumer<String> {
	public static void main(String[] args) {
		 Consumer<String> consumer = new Test();
		 consumer.accept("-> Ahamd");
	}

	@Override
	public void accept(String t) {
		System.out.println("Output" + t);
		
	}

	
}
