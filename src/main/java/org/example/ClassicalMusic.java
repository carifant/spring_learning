package org.example;

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
}
