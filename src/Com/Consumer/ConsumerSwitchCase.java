package Com.Consumer;

import java.util.function.Consumer;

public class ConsumerSwitchCase {
	public static void main(String[] args) {
		Consumer<String> city = name -> {
			switch (name) {
			case "Dilhi":
				System.out.println("dilhi is my city");
				break;
			case "Banglor":
				System.out.println("dilhi is my Banglor");
				break;
			case "Mumbai":
				System.out.println("dilhi is my Mumbai");
				break;
			default:
				System.out.println("my city is kashmeer");

				break;
			}
		};
		city.accept("Mumbai");
	}
}
