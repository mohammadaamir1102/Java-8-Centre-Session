package BiFunction;

import java.util.function.BiFunction;

public class BiFunction7 {

	public static void main(String[] args) {
        BiFunction<String, String, Boolean> areEqual = (a, b) -> a.equals(b);
        boolean result = areEqual.apply("Java", "Java");
        System.out.println("Strings are equal: " + result);

	}

}
