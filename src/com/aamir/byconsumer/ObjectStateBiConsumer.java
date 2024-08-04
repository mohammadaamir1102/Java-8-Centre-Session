package com.aamir.byconsumer;

import java.util.function.BiConsumer;

class Person {
    String name;
    int age;

    void update(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectStateBiConsumer {
    public static void main(String[] args) {
        Person person = new Person();
        BiConsumer<String, Integer> updater = person::update;
        updater.accept("Abrar", 30);
        System.out.println(person.name + " is " + person.age + " years old");
    }
}
