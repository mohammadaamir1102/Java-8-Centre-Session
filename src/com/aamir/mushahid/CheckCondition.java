package com.aamir.mushahid;
interface DoubleParam{
	int checkValue(int first,int second);
}
public class CheckCondition {
public static void main(String[] args) {
	DoubleParam dParam =(first,Second) ->{
		if (first>Second) {
			throw new RuntimeException("First is greater than Second");
			
		}
		return Second;
	};
	dParam.checkValue(10, 8);
}
}
