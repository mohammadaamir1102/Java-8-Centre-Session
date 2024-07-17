package com.sameer.Lambda.Predicate;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Predicate;

public class CheckListContaisDuplicateOrNot {

	public static void main(String[] args) {
		Predicate<List<Integer>> checkDuplicate = list -> {

			Set<Integer> hashSet = new HashSet<Integer>();
			for (Integer num : list)
				if (!hashSet.add(num))
					return true;

			return false;
		};

		System.out.println(checkDuplicate.test(List.of(1, 2, 3, 4, 4, 5, 6)));
	}
}
