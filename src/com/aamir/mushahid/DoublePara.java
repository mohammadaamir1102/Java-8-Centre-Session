package com.aamir.mushahid;
interface Sum{
	int sum(int no1,int no2);
}
public class DoublePara {
public static void main(String[] args) {
	Sum sum1=(no1,no2) -> {return no1-no2;};
	System.out.println(sum1.sum(10, 31));
}
}
