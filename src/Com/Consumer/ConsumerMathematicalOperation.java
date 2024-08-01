package Com.Consumer;

import java.util.function.Consumer;

public class ConsumerMathematicalOperation {
public static void main(String[] args) {
	Consumer<Integer> con= mult -> System.out.println(mult * mult);
	con.accept(4);
}
}
