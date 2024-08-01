package Function;

import java.util.function.Function;

public class Function9 {
	public static void main(String[] args) {
		Function<Integer, String> toBinaryString = x -> Integer.toBinaryString(x);
        int number = 10;
        System.out.println("Binary representation of " + number + " is : " + toBinaryString.apply(number));
        }
}
