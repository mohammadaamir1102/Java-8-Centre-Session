package com.sameer.Lambda.Predicate;

import java.util.function.Predicate;

public class CheckIntegerIsPrimeOrNot {
	public static void main(String[] args) {
		Predicate<Integer> isPrime = num -> {

			if (num <= 1)
				return false;

			for (int i = 2; i <= Math.sqrt(num); i++)
				if (num % i == 0)
					return false;
			return true;

		};
		System.out.println(isPrime.test(4));
		System.out.println(isPrime.test(5));
	}

}
