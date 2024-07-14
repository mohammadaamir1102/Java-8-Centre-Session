package com.aamir.suhail;

interface MultipleParameterTest{
	int sum(int a, int b);
}

public class MultipleParameter {

	public static void main(String[] args) {
		
		MultipleParameterTest t1=(num1,num2)->{	return num1+num2;};
					
		
		System.err.println(t1.sum(1, 10));
	}

}
