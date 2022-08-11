package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Iguana implements Animal {

    @Value("${vision}")
    private String vision;

    @Override
    public void animalPlus() {
        System.out.println("Plus method for iguana.");
    }

    @Override
    public void animalMinus() {
        System.out.println("Minus method for iguana.");
    }
}
