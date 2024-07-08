package com.aamir.Tufail;
interface Testt{
	void show();
}
public class LambdaExpression {
	public static void main(String[] args) {
		Testt s=()->System.out.println("heloo");
		s.show();
	}

}
