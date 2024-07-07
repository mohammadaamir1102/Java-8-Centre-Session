package com.aamir.aadilnoor.lambda;

interface Test1 {
	void test();
}

public class MyInterface implements Test1 {

	public void test() {
		System.out.println("Testing..");
	}

	public static void main(String[] args) {
		/*
		 * MyInterface myInterface = new MyInterface(); myInterface.test();
		 */

		Test1 t = () -> System.out.println("teseeeeeeee");

		t.test();
	}

}
