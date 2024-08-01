package Supplier;

import java.util.function.Supplier;

public class Supplier6 {

	public static void main(String[] args) {
     Supplier<String> age=()-> "name: ".concat("abdul").repeat(3);
     System.out.println(age.get());
     
    		 
	}

}
