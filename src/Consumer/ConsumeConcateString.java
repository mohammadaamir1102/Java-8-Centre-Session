package Consumer;

import java.util.function.Consumer;

public class ConsumeConcateString {
public static void main(String[] args) {
	Consumer<String> Cc= str -> System.out.println(str +"World");
	Cc.accept("Hello");;
}
}
