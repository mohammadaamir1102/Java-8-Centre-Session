package BiFunction;

import java.util.function.BiFunction;

public class Bifunction {
public static void main(String[] args) {
	BiFunction<String, String, String> concatenate = (a, b) -> a + "-" + b;
    String result = concatenate.apply("Hello", "World");
    System.out.println("Concatenated: " + result);
}
}
