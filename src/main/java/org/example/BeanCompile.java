package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCompile {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PlayerOfMusic playerOfMusic = context.getBean("musicPlayer", PlayerOfMusic.class);
        System.out.println(playerOfMusic.getVolume() + playerOfMusic.getName());
        playerOfMusic.playMusic();


        context.close();
    }
}
