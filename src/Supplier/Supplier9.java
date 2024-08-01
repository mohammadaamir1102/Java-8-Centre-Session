package Supplier;

import java.util.function.Supplier;

public class Supplier9 {

	public static void main(String[] args) {
		
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("Supplier!");
        Supplier<StringBuilder> stringBuilderSupplier =()-> sb.reverse();
        System.out.println(stringBuilderSupplier.get());
	}

}
