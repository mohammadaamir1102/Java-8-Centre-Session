package com.aamir.suhail;

interface GreaterValue
{
	int greater(int a,int b);
}
public class CheckGreaterValue {

	public static void main(String[] args) {
		GreaterValue gv=(num1,num2)->{
			if(num1>num2)
			{
				throw new RuntimeException("num1 should not greater than num2");
			}
			else {
				return num2;
			}
			
	};
System.out.println(gv.greater(10, 20));	

}}
