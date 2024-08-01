package BiFunction;

import java.util.function.BiFunction;

public class BiFunction4 {

	public static void main(String[] args) {
		 BiFunction<Double, Double, Double> divide = (a, b) -> a / b;
	        double result = divide.apply(10.0, 2.0);
	        System.out.println("Quotient: " + result);
	}

}
