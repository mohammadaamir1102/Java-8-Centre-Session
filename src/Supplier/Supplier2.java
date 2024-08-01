package Supplier;

import java.util.function.Supplier;

public class Supplier2 {
public static void main(String[] args) {
	Supplier<Integer> add=()-> 10+10;
	System.out.println(add.get());
}
}
