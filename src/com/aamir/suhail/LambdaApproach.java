package com.aamir.suhail;

interface LambdaInterface
{
	void ram();
}
public class LambdaApproach {

	public static void main(String[] args) {
		LambdaInterface lmbInterface=() ->System.out.println("52 Gb");
		lmbInterface.ram();

	}

}
