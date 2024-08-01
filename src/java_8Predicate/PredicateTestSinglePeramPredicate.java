package java_8Predicate;
  
 interface SnglePerameter{
	 void sun(int number);
 }
public class PredicateTestSinglePeramPredicate {
    public static void main(String[] args) {
    	SnglePerameter sp=(number)-> System.out.println("this is :"+ number);
    		sp.sun(7684);
    	
	}
}
