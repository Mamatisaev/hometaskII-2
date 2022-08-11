package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "singleton")
public class Person {

    @Value("${firstName}")
    private String firstName;
    @Value("${age}")
    private int age;

    private Animal animal;

    @Autowired
    public Person(@Qualifier("woodpecker") Animal animal) {
        this.animal = animal;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Somebody's " +
                "first name is " + firstName +
                " and age is " + age +
                "years old.";
    }

    public void getYourAnimal() {
        animal.animalPlus();
        animal.animalMinus();
        System.out.println("His name is " + getFirstName() + " and he is " + getAge() + " years old.");
    }

    @PostConstruct
    public void init() {
        System.out.println("Person class: init method.");
    }

    @PostConstruct
    public void destroy() {
        System.out.println("Person class: destroy method.");
    }

}