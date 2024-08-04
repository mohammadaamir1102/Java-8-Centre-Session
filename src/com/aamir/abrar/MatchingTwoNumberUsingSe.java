package com.aamir.abrar;

import java.util.Set;

public class MatchingTwoNumberUsingSe {

	public static void main(String[] args) {

	
	Set<Integer> set1 = Set.of(1,2,3);
	Set<Integer> set2 = Set.of(1,2,3);
	boolean noneMatch = !set1.stream().noneMatch(set2::contains);
	System.out.println(noneMatch);
	
	}

}
