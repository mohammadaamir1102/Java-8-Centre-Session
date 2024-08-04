package com.aamir.bifunction;

import java.util.function.BiFunction;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CustomClassBiFunction {
	public static void main(String[] args) {
		BiFunction<String, Integer, Person> biFunction = Person::new;
		Person person = biFunction.apply("Alice", 30);
		System.out.println(person.name + " is " + person.age + " years old");
	}
}
