package com.aamir.abubakar.consumer;

import java.util.function.Consumer;

public class ConsumerStrin {
public static void main(String[] args) {
	Consumer<String> consumer=  str  ->   System.out.println(str.length());
 consumer.accept("abubakr");
}
}
