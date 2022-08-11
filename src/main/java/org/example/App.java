package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AnimalConfig.class);

        Person person = context.getBean("person", Person.class);
        person.getYourAnimal();
        context.close();

    }
}
