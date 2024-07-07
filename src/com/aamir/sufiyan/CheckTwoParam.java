package com.aamir.sufiyan;

interface DoubleParam {
	int checkGreater(int digit1, int digit2);
}

public class CheckTwoParam {
	public static void main(String[] args) {
		DoubleParam dp=(d1,d2) -> {
			if(d1>d2) {
				throw new RuntimeException ("digit1 is greater than digit2");
			}
			
			return d2;
			
			
		};
		System.out.println(dp.checkGreater(5, 10));
		
	}
}