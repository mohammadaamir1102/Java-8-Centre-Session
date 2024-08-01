package Function;

import java.util.function.Function;

public class Function6 {
public static void main(String[] args) {
	 Function<String, String> addPrefix = s -> "Prefix_" + s;
     String text = "example";
     System.out.println("Prefixed string: " + addPrefix.apply(text));
}
}
