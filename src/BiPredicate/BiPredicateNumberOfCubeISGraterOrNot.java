package BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateNumberOfCubeISGraterOrNot {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> cubeEqual = (sum1, sum2) -> {
			int number1 = sum1 * sum1 * sum1;
			int number2 = sum2 * sum2 * sum2;
			return ((number1 )== (number2));
		};
		System.out.println(cubeEqual.test(12, 12));
		/*
		 * int numLength = 3; int numLength1 = 3; if (cubeEqual.test(numLength,
		 * numLength1)) { System.out.println("Cubes of those number : " + numLength +
		 * " are " + numLength1 + " are equal"); } else { System.out.println(
		 * "Cubes of those number : " + numLength + " are " + numLength1 +
		 * " are not equal"); }
		 */
		
	}

}
