package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier10 {

	public static void main(String[] args) {
		Supplier<Integer> randomNumber = () -> new Random().nextInt(10000);
		System.out.println("Random number: " + randomNumber.get());

	}

}
