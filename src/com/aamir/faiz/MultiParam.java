package com.aamir.faiz;

interface MultiParamTest{
	int sum(int no1,int no2);
}
public class MultiParam{
	
	public static void main(String[] args) {
		MultiParamTest ts=(no1,no2)-> no1+no2;
		System.out.println(ts.sum(10, 20));
	}
}