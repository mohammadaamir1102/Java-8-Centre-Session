package Function;

import java.util.function.Function;

public class Function3 {
public static void main(String[] args) {
	Function<Integer, Integer> square = x -> x * x;
    System.out.println("Square of 5: " + square.apply(5));
	

 }
}
