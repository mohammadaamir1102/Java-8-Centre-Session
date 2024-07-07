package com.aamir.faiz;

interface TestLambda{
    void show();
}
public class LambdaApproach {
	public static void main(String[] args) {
		TestLambda t=()-> System.out.println("Hello Lambda Approach");
			t.show();
		
	}

}
