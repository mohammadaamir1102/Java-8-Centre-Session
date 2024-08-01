package Function;

import java.util.function.Function;

public class Function4 {
public static void main(String[] args) {
	Function<String, String> toUpperCase = s -> s.toUpperCase();
    String text = "hello";
    System.out.println("Uppercase version: " + toUpperCase.apply(text));
}
}
