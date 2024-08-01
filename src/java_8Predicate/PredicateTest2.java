package java_8Predicate;

interface Demo {
	void demo();

}

class Testt {
	void num() {
		System.out.println("xyz");
	}
}

public class PredicateTest2 extends Testt {
	public static void main(String[] args) {
		Demo d = () -> System.out.println("....done the code");
		d.demo();

		Testt t = new Testt();
		t.num();
	}
}
