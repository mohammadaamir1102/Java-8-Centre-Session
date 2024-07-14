package com.aamir.suhail;

import java.util.List;
import java.util.function.Predicate;

interface Test {
public void test1();}

 class TestSample implements Test{

	public static void main(String arg[])
	{
		TestSample objSample=new TestSample();
		objSample.test1();
	}
	@Override
		public void test1()
		{
			System.out.println("hello...");
		}
}
