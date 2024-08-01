
package Com.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerStringUppercase {
public static void main(String[] args) {
	List<String> list= Arrays.asList("Mr","dilshad","Siddiqui");
	Consumer<String> name2= num-> System.out.println(num.toUpperCase());
	list.forEach(name2);
}
}
