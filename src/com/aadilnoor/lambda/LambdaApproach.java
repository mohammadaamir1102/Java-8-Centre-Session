package com.aadilnoor.lambda;

interface LambdaInterface{
	void shape();
}
public class LambdaApproach {

	public static void main(String[] args) {
		
		LambdaInterface lambdaInterface = () -> System.out.println("Shape is Rectangle");
		lambdaInterface.shape();
	}
}
