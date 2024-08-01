package Supplier;

import java.util.function.Supplier;

public class Supplier4 {

	public static void main(String[] args) {
		Supplier<Integer> fixedIntegerSupplier = () -> 42 % 2 + 24;
		System.out.println("Fixed integer: " + fixedIntegerSupplier.get());
	}

}
