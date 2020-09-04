package org.example;

import java.util.List;

public class PlayerOfMusic {
    private List<Music> listOfMusic;
    private int volume;
    private String name;

    public PlayerOfMusic() {
    }

    public List<Music> getListOfMusic() {
        return listOfMusic;
    }

    public void setListOfMusic(List<Music> listOfMusic) {
        this.listOfMusic = listOfMusic;
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
        for (Music music : listOfMusic) {
            System.out.println("now is playing: " + music.getSong());
        }
    }
}
