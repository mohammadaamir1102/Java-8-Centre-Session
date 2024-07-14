package com.aamir.biPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class DetermineTheListSizeThatIsEqualsOrNot {

    public static void main(String[] args) {

        List<Integer> firstListData = getFirstListData();
        List<Integer> secondListData = getSecondListData();
        List <String> thirdData = getThirdListData();
//                                                                         3           ==         3
        BiPredicate<List<?>, List<?>> outPut = (firsList, thirdList) -> firsList.size() == thirdList.size();
        System.out.println(outPut.test(firstListData,thirdData));
    }

    public static List<Integer> getFirstListData(){
        return List.of(1,2,3);
    }
    public static List<Integer> getSecondListData(){
        List<Integer> secondList = new ArrayList<>();
        secondList.add(1);
        secondList.add(2);
        secondList.add(3);
        return secondList;
    }
    public static List<String> getThirdListData(){
        return Arrays.asList("a","b","c");
    }

}
