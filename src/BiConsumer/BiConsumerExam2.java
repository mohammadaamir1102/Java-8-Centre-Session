package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExam2 {
	 public static void main(String[] args) {
	        BiConsumer<String, Double> convertAndPrint = (currency, amount) -> 
	            System.out.println("Amount in " + currency + ": " + (amount * 1.1));
	        
	        convertAndPrint.accept("USD", 100.0);
	    }
}
