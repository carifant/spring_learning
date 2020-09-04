package org.example;

public class ReggyMusic implements Music {

    private ReggyMusic() {
    }

    public static ReggyMusic fabricMethod() {
        return new ReggyMusic();
    }

    public void initMethod() {
        System.out.println("I was created");
    }

    public void destroyMethod() {
        System.out.println("I will destroy");
    }

    @Override
    public String getSong() {
        return "don't worry be happy";
    }
}
