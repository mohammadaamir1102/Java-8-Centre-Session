package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Supplier7 {

	public static void main(String[] args) {
     List<String> product=new ArrayList();
     product.add("MobilePhones");
     product.add("Grosress");
     product.add("Cloths");
     product.add("Electronic");
     Supplier<String> gods=()->product.toString();
     System.out.println(gods.get());
	}

}
