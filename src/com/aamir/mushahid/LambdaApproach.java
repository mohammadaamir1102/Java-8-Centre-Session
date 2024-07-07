package com.aamir.mushahid;
interface Pc{
	void show();
}
public class LambdaApproach {
	public static void main(String[] args) {
		Pc pc=() -> System.out.println("hello");
		pc.show();
		
	}

}
