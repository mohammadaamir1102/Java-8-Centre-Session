package com.aamir.faiz;

interface TradiAppro{
	void test();
}
public class TraditionalApproachFunctionalInterface implements TradiAppro{

	@Override
	public void test() {
		System.out.println("hello Traditional Approach");
	}
	public static void main(String[] args) {
		TraditionalApproachFunctionalInterface test = new TraditionalApproachFunctionalInterface();
		test.test();
	}

}
