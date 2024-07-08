package com.aamir.Tufail;
interface Tufail{
	 void m1();
}
public class FunctionalInterface implements Tufail {
	public void m1() {
		System.out.println("byye");
		
	}
	public static void main(String[] args) {
		FunctionalInterface s=new FunctionalInterface();
		s.m1();
		}

}
