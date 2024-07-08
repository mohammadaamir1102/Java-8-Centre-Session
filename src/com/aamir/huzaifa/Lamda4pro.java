package com.aamir.huzaifa;
interface HuLamda4pro {
	int Multi (int fir, int se);
}

public class Lamda4pro {
	public static void main(String[] args) {
		HuLamda4pro m =(fi, So)->{
			if(fi>So) {
				throw new RuntimeException("Good bye huzaifa");
			}
			return So;
		};
	System.out.println(	m.Multi(12,24));
		
	}

}
