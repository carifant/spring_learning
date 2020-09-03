package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCompile {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("classicBean", Music.class);
        Music music2 = context.getBean("rockBean", Music.class);
        Music music3 = context.getBean("reggyBean", Music.class);


        PlayerOfMusic playerOfMusic = new PlayerOfMusic(music);
        playerOfMusic.playMusic();
        PlayerOfMusic playerOfMusic2 = new PlayerOfMusic(music2);
        playerOfMusic2.playMusic();
        PlayerOfMusic playerOfMusic3 = new PlayerOfMusic(music3);
        playerOfMusic3.playMusic();
        context.close();
    }
}
