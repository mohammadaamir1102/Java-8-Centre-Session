package BiConsumer;

import java.util.function.BiConsumer;

class Demo {
	private String name;
	private int age;

	public Demo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}
}

public class BiConsumerExamp3 {
	public static void main(String[] args) {
		BiConsumer<Demo, String> bc = (person, location) ->
		System.out.println(person + " live in : " + location);

		Demo dm = new Demo("Bob", 12);
		bc.accept(dm, "Navi Mumbai");
	}

}
