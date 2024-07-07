package com.aamir.abrar;

interface Double
{
	int sum(int no1, int no2);
}

public class DoubleParametre {

	public static void main(String[] args) {

		Double doubl=(no1,no2)-> {return no1+no2;};
		System.out.println(doubl.sum(10, 12));
	}

}
