package com.aamir.suplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class LocalDateTimeUsingSupplier {

	public static void main(String[] args) {

		Supplier<LocalDateTime> localdateSupplier= LocalDateTime::now;
		System.out.println(localdateSupplier.get());
	}

}
