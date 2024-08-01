package BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerUpdateingMap {
public static void main(String[] args) {
	Map<String,Integer> mp=new HashMap<>();
	mp.put("Abdul", 6969);
	mp.put("Kadir", 420);
	
	BiConsumer<String,Integer> bic=(key,value)->{
		System.out.println(key+" "+value);
	};
	 mp.forEach(bic);
	
}
}
