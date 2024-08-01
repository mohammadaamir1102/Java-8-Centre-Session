package BiFunction;

import java.util.function.BiFunction;

public class BiFunction2 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> max = (a, b) -> (a > b) ? a : b;
        int result = max.apply(10, 20);
        System.out.println("Maximum: " + result);

	}

}
