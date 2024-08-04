package com.aamir.suplier;

import java.util.function.Supplier;

class Person
{
	String name="ABrar Khan";
}

public class ObjectCreationSupplier {

	public static void main(String[] args) {
		Supplier<Person> objectCreation= Person::new;
		Person person = objectCreation.get();
	   System.out.println(person.name);

	}

}
