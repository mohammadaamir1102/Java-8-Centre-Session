package com.aamir.consumer;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class CnsumerProgramUsingHashSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Abrar");
		set.add("khan");
		set.add("mushahsid");
		set.add("Ayaz");

		Consumer<String> consum=System.out::println; 
		set.forEach(consum);
	}

}
