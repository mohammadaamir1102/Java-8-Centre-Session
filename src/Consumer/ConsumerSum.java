package Consumer;

import java.util.function.Consumer;

public class ConsumerSum {
public static void main(String[] args) {
	Consumer<Integer> con= num -> System.out.println( num + num + 20);
	con.accept(15);
}
}
