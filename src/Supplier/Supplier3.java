package Supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Supplier3 {

	public static void main(String[] args) {
		Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();
        System.out.println("Current date: " + dateSupplier.get());
	}

}
