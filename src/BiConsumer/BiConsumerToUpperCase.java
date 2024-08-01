package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerToUpperCase {
	public static void main(String[] args) {
		BiConsumer<String, String> name = (name1, name2) -> {
		System.out.println(name1.toUpperCase()+" "+name2.toUpperCase());
		};
		name.accept("arhan","Siddiqui");

	}
}
