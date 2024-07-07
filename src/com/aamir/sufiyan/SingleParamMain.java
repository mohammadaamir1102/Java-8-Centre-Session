package com.aamir.sufiyan;

interface TestSingleParam {
	void digit(int a);
}

public class SingleParamMain {

	public static void main(String[] args) {
		TestSingleParam tsp = (num) -> System.out.println("number is : " + num);
		tsp.digit(911);
	}
}
