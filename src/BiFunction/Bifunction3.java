package BiFunction;

import java.util.function.BiFunction;

public class Bifunction3 {

	public static void main(String[] args) {
		 BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
	        int result = multiply.apply(4, 7);
	        System.out.println("Product: " + result);
	}

}
