package Function;

import java.util.function.Function;

public class Function2 {
public static void main(String[] args) {
	 Function<String, Integer> stringLengthFunction = str -> str.length();

     String input = "Hello, Java 8!";
     Integer length = stringLengthFunction.apply(input);

     System.out.println("Length of the input string: " + length);
}
}
