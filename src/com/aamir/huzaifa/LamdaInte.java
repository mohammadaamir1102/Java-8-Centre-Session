package com.aamir.huzaifa;

interface Lambda {
	void ram();

}
public class LamdaInte{
	
	public static void main(String[] args) {
		Lambda lamdLambda =()->
		System.out.println("Hello");
		lamdLambda.ram();
	}
	
}
