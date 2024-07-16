package com.aamir.Tufail;
interface TestSingleclass{
	int  sum(int m1,int m2 );
}
public class Number {
	public static void main(String[] args) {
		
		TestSingleclass st=(t ,n)-> t+n;
			
			System.out.println(st.sum(10, 20));
		}
	}
		




	

