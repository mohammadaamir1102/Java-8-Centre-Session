package com.aamir.faiz;

interface Faiz1 {
	void show();
}

public class Faiz {
	public static void main(String[] args) {
		Faiz1 f = () -> System.out.println("helo");

		f.show();
	}
}
 