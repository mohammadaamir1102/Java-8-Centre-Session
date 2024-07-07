package com.aamir.mushahid;
interface TestSingle{
	void mobileno(int number);
}
public class SinglePara {
	public static void main(String[] args) {
		TestSingle tSingle = (number) -> System.out.println(number);
		tSingle.mobileno(134);
	}
}
