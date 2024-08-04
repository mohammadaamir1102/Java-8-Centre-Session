package com.aamir.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerListOfString {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Dilshad,SakiNaka,Center");
		Consumer<String> con = name1 -> System.out.println(name1);
		name.forEach(con);
	}
}