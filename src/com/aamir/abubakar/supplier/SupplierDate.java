package com.aamir.abubakar.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<LocalDate> supplier=()-> LocalDate.now();
LocalDate localDate = supplier.get();
System.out.println(localDate);
	}

}
