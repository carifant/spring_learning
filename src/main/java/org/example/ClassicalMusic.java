package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic fabricMethod() {
        return new ClassicalMusic();
    }

    public void initMethod() {
        System.out.println("I was created");
    }

    public void destroyMethod() {
        System.out.println("I will destroy");
    }

    @Override
    public String getSong() {
        return "four seasons";
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("i will destroyed");
    }

    @PostConstruct
    public void doMyCreate() {
        System.out.println("I was created!");
    }
}
