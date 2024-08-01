package Com.Consumer;

import java.util.function.Consumer;

public class ConsumerTest {
  public static void main(String[] args) {
	Consumer<String> con= massage -> System.out.println(massage);
	con.accept("I am consumer....");
}
}
