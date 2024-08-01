package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier8 {

	public static void main(String[] args) {
		Supplier<Double> randomDoubleSupplier = () -> new Random().nextDouble();
        Double randomValue = randomDoubleSupplier.get();
        System.out.println("Random double: " + randomValue);
	}

}
