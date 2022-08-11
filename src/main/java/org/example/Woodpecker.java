package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Woodpecker implements Animal {

    @Value("${walk}")
    private String walk;

    @Override
    public void animalPlus() {
        System.out.println("Plus method for woodpecker.");
    }

    @Override
    public void animalMinus() {
        System.out.println("Minus method for woodpecker.");
    }
}
