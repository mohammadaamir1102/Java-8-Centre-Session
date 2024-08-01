package BiConsumer;

import java.util.function.BiConsumer;

public class BiconsumerStringMethods {
public static void main(String[] args) {
	BiConsumer<String,String> bc=(str1,str2) ->{
	 System.out.println(str1.startsWith("dil"));
	 System.out.println(str2.endsWith("an"));
	 System.out.println(str1.concat(str2));
	 System.out.println(str1.toUpperCase());
	};
	bc.accept("dilshad", "khan");
    
}
}
