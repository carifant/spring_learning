package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    private RockMusic() {
    }

    public static RockMusic fabricMethod() {
        return new RockMusic();
    }

    public void initMethod() {
        System.out.println("I was created");
    }
    public void destroyMethod() {
        System.out.println("I will destroy");
    }

    @Override
    public String getSong() {
        return "Hard rock alilya";
    }
}
