package com.aamir.sufiyan;

interface Test {
	void test();
}

public class TraditionalApproach implements Test {

	@Override
	public void test() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		Test testImpl = new TraditionalApproach();
		testImpl.test();
	}

}
