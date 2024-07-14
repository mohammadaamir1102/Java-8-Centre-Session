package com.aamir.suhail;

 
	interface GreaterV
	{
		int greater(int a,int b);
	}
	public class GreaterValueDemo {

		public static void main(String[] args) {
			GreaterV gv=(num1,num2)->{
				if(num1>num2)
				{
					throw new RuntimeException("num1 should not greater than num2");
				}
				else {
					return num2;
				}
				
		};
	System.out.println(gv.greater(20, 10));	

	}
		}

