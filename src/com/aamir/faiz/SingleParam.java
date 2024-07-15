package com.aamir.faiz;

interface SingleParamTest {
	void digit(int no);
}

public class SingleParam {

	public static void main(String[] args) {
		SingleParamTest ts = (no) -> System.out.println("Number is " + no);
		ts.digit(30);
	}
}
