package com.aamir.ansarul.consumer;

import java.util.function.Consumer;

public class CunsumerSubs {
public static void main(String[] args) {
	Consumer<Integer> cons=subs ->System.out.println(subs-289);
	cons.accept(93);
}
}
