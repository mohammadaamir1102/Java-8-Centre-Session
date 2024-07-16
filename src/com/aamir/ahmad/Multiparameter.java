package com.aamir.ahmad;

interface MultiParamTest{
	int sum(int no1,int no2);
}
public class Multiparameter{
	
	public static void main(String[] args) {
		MultiParamTest ts=(no1,no2)-> no1+no2;
		System.out.println(ts.sum(10, 20));
	}
}