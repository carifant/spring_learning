package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
@Scope("prototype")
public class PlayerOfMusic {

    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    @Value("${playerOfMusic.volume}")
    private int volume;
    @Value("${playerOfMusic.name}")
    private String name;

    public PlayerOfMusic() {
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic() {
        System.out.println("now is playing: " + music.getSong());
    }
}
