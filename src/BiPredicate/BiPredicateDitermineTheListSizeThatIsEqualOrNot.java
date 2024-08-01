package BiPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateDitermineTheListSizeThatIsEqualOrNot {
public static void main(String[] args) {
	List<Integer> firstData=getFirstListData();
	List<Integer> firstSecond=getSecondListData();
	
	BiPredicate<List<Integer>, List<Integer>> output=(getFirstListData,getSecondListData)-> firstData.size()==firstSecond.size();
	System.out.println(output.test(firstData, firstSecond));
}
public static List<Integer> getFirstListData(){
	return List.of(1,2,3);
	
}
public static List<Integer> getSecondListData(){
	List<Integer> secondList=new ArrayList<>();
	secondList.add(1);
	secondList.add(2);
	secondList.add(3);
	return secondList;

	
}
}
