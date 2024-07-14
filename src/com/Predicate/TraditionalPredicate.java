package com.Predicate;

import java.util.function.Predicate;

public class TraditionalPredicate implements Predicate<Integer>
{

	public static void main(String[] args) {
		Predicate<Integer> predicate=new TraditionalPredicate();
		System.out.println(predicate.test(12));
		

	}

	@Override
	public boolean test(Integer integer) {
		if(integer%2==0)
		{
			return true;
		}
		
		return false;
	}

}
