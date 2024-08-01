package BiFunction;

import java.util.function.BiFunction;

public class BiFunction8 {

	public static void main(String[] args) {
		BiFunction<Double, Integer, Double> power = (base, exponent) -> Math.pow(base, exponent);
        double result = power.apply(2.0, 3);
        System.out.println("2^3: " + result);
	}

}
