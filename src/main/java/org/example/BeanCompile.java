package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCompile {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PlayerOfMusic playerOfMusic = context.getBean("musicPlayerForClassic", PlayerOfMusic.class);
        playerOfMusic.playMusic();
        PlayerOfMusic playerOfMusic2 = context.getBean("musicPlayerForRock", PlayerOfMusic.class);
        playerOfMusic2.playMusic();
        PlayerOfMusic playerOfMusic3 = context.getBean("musicPlayerForReggy", PlayerOfMusic.class);
        playerOfMusic3.playMusic();
        context.close();
    }
}
