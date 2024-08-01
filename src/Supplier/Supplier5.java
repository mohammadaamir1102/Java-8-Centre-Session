package Supplier;

import java.util.function.Supplier;

public class Supplier5 {

	public static void main(String[] args) {
		Supplier<Integer> persentage = () -> 390*100/600;
		System.out.println("Your persantage : "+persentage.get());
	}

}
