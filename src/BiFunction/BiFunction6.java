package BiFunction;

import java.util.function.BiFunction;

public class BiFunction6 {

	public static void main(String[] args) {
		 BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;
	        int result = subtract.apply(10, 4);
	        System.out.println("Difference: " + result);
	}

}
