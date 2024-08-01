package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPrefixToStrong {
public static void main(String[] args) {
	List<String> list=Arrays.asList("manu","sonu","golu");
	Consumer<String> consumerPrefix= name -> System.out.println("NAME :"+name);
	list.forEach(consumerPrefix);
}
}
