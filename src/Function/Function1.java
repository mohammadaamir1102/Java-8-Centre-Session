package Function;

import java.util.function.Function;

public class Function1 {
	public static void main(String[] args) {
		Function<Integer, Integer> multiplyByTwo = x -> x * 2;
		Function<Integer, Integer> addTen = x -> x + 10;

		Function<Integer, Integer> multiplyAndAdd = multiplyByTwo.andThen(addTen);

		Integer result = multiplyAndAdd.apply(5);

		System.out.println("Result after chaining functions: " + result);
	}
}
