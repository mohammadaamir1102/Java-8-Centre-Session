package com.aamir.consumer;

import java.util.function.Consumer;
class Person {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
public class  ObjectStateConsumer {
	 public static void main(String[] args) {
		 Person person = new Person();
	        Consumer<String> nameUpdater = person::setName;
	        nameUpdater.accept("John Doe");
	        System.out.println(person.name);
	    }
}
