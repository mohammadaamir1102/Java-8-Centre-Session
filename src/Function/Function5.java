package Function;

import java.util.function.Function;

public class Function5 {
public static void main(String[] args) {
	 Function<Integer, Integer> doubleValue = x -> x * 2;
     int number = 7;
     System.out.println("Double of " + number + " is: " + doubleValue.apply(number));
   }
}
