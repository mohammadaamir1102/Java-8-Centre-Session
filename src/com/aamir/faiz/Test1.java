package com.aamir.faiz;

interface TradiAppro{
	void test();
}
public class Test1 implements TradiAppro{

	@Override
	public void test() {
		System.out.println("hello Traditional Approach");
	}
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.test();
	}

}
