package com.aamir.abrar;

interface Mobile {
	int chekVAlue(int a, int b);
}
public class ChekCondition {
	public static void main(String[] args) {
		Mobile mobile = (a, b) -> {
			if (a > b)
				throw new RuntimeException("fi is greate of se");
			return b;
		};
		System.out.println(mobile.chekVAlue(22, 12));
	}
}
