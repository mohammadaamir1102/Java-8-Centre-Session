package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerTest {
public static void main(String[] args) {
	BiConsumer<String,String> Con= (firstname,lastname )->{
		System.out.println(firstname+" "+lastname);
		};
		Con.accept("Dilshad","siddiqui");
}
}
