package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerIfElse {
public static void main(String[] args) {
	BiConsumer<Integer,Float> sallry= (id,num)->{
     System.out.println("id: "+id+" "+"sallry: "+num);
	};
	sallry.accept(121, 100000.0f);
}
}
