package com.aamir.huzaifa;
interface Peep{
	int Add(int Number ,int Number2);
}
public class Lamda3pRO {

	public static void main(String[] args) {
		Peep p =(Number ,Number2)-> Number+Number2;
		System.out.println(p.Add(10,10));
	}

}
