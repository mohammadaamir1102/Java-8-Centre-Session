package com.aamir.ahmad;

interface TradiAppro{
	void test();
}
public class Test1Simple implements TradiAppro{

	@Override
	public void test() {
		System.out.println("hello Traditional Approach");
	}
	public static void main(String[] args) {
		Test1Simple test = new Test1Simple();
		test.test();
	}

}