package com.aamir.suplier;

import java.util.function.Supplier;

class ExpensiveResource
{
	ExpensiveResource()
	{
		System.out.println("that is expensive resource");
	}
}

public class LazyInitializationSupplier {

	public static void main(String[] args) {

		Supplier<ExpensiveResource> expensiveSupplier= ExpensiveResource::new;
		expensiveSupplier.get();
		
	}

}
