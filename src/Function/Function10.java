package Function;

import java.util.function.Function;

public class Function10 {
	public static void main(String[] args) {
		Function<Integer, Integer> add5 = x -> x + 5;
		Function<Integer, Integer> multiplyBy2 = x -> x * 2;

		// Chain functions
		System.out.println("Result: " + add5.andThen(multiplyBy2).apply(3));         // (3 + 5) * 2 = 16
        System.out.println("Result: " + multiplyBy2.compose(add5).apply(3));         // 3 * 2 + 5 = 11
	}
}
