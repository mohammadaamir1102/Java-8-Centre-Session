package com.aamir;

interface Mobile{
	void ram();
}
public class Test implements Mobile {

	@Override
	public void ram() {
		System.out.println("32 GB");
	}

	public static void main(String[] args) {
		Mobile m = new Test();
		m.ram();
	}
}
