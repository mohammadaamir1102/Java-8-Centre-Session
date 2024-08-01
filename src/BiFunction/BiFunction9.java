package BiFunction;

import java.util.function.BiFunction;

public class BiFunction9 {

	public static void main(String[] args) {
		BiFunction<String,String,String> show= (str,str1)->
		str.substring(2).toUpperCase().concat(str1.toUpperCase());
		String num=show.apply("United", "State");
		System.out.println(num);
	}

}
