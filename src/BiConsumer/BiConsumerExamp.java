package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExamp {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printCustomFormat = (name, age) -> 
            System.out.println("The person named " + name + " is aged " + age);
        
        printCustomFormat.accept("Bob", 25);
    }

}
