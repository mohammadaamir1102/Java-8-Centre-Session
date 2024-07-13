package com.aamir.faiz;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Practice {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number : ");
		int a = scanner.nextInt();

		System.out.println("Enter Second Number : ");
		int b = scanner.nextInt();

		BiPredicate<Integer, Integer> biPredicate = (hell, hell1) -> {
			if (hell > hell1) {
				return true;
			}
			throw new RuntimeException("Exception:- I am Back!!!.........");

		};
		try {
			System.out.println(biPredicate.test(a, b));
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());

		}
		scanner.close();
	}
}
