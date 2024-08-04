package com.aamir.function;

import java.util.function.Function;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CustomClassFunction {
	public static void main(String[] args) {
		Function<Person, String> function = person -> person.name + " is " + person.age + " years old";
		Person person = new Person("Alice", 30);
		System.out.println(function.apply(person));
	}
}
