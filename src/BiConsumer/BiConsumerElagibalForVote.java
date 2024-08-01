package BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerElagibalForVote {
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> bc=(student,student1) -> {
			if (student>=18 && student1<=20) {
				System.out.println(student +"I am elagibal for Vote");
			}
			else if (student>20 && student<30) {
				System.out.println("I am elagibal for Marrage ");
			}
			else {
				System.out.println("I am tenager");
			}
		};
	bc.accept(18,20);
	}
}
