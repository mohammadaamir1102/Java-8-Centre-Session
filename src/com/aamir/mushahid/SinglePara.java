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

	/*
	 * interface TestSingle{ void Test(int marks); }
	 * 
	 * public class SinglePara { public static void main(String[] args) { TestSingle
	 * ts = (marks)-> System.out.println(marks);
	 * System.out.print("Highest Marks in the world"+"->"); ts.Test(700); } }
	 */