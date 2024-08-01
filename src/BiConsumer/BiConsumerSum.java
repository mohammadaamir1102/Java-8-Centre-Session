package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerSum {
	static int	sum2;
public static void main(String[] args) {
	BiConsumer<Integer,Integer> sum=(num1,num2)->{
	sum2=(num1*num2);
	};
	sum.accept(20,10);
	System.out.println(sum2);
}
}
