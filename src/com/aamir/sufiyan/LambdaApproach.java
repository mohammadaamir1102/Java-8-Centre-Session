package com.aamir.sufiyan;

interface Lambda_Test {
	void test();
}

public class LambdaApproach {
	public static void main(String[] args) {
		Lambda_Test lambda = () -> System.out.println("Lambda Expression");
		lambda.test();
	}

}
