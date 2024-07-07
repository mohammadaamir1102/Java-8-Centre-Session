package com.aamir.abrar;

interface TSP {
	void test(int number);
}

public class Main {

	public static void main(String[] args) {

		TSP ts = (number) -> System.out.println("number is" + number);
		ts.test(786);
	}

}
