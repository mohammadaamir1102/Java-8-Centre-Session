package com.aamir.byconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapIterationBiConsumer {

	public static void main(String[] args) {

		Map<String, Integer> map= new HashMap<>();
		map.put("Abrar", 101);
		map.put("Ayaz",102);
		map.put("Mushahid",103);
		
		BiConsumer<String, Integer> biConsumer=(key,value) ->System.out.println(key+" "+value);
		map.forEach(biConsumer);
	}

}
