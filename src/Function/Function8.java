package Function;

import java.util.function.Function;

public class Function8 {
	public static void main(String[] args) {
		Function<Double, Double> celsiusToFahrenheit = c -> (c * 9 / 5) + 32;
		double celsius = 25.0;
		System.out.println(celsius + "C in Fahrenheti is: " + celsiusToFahrenheit.apply(celsius) + " F");
	}
}
