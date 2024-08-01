package BiFunction;

import java.util.function.BiFunction;

public class BiFunction5 {

	public static void main(String[] args) {
		BiFunction<Integer, Double, String> createString = (a, b) -> "Integer: " + a + ", Double: " + b;
		String result = createString.apply(5, 3.14);
		System.out.println("Resulting String: " + result);
	}

}
