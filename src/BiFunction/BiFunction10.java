package BiFunction;

import java.util.function.BiFunction;

public class BiFunction10 {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
    int result = add.apply(5, 3);
    System.out.println("Sum: " + result);
}
}
