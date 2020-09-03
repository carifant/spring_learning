package org.example;

public class PlayerOfMusic {
    private Music music;

    public PlayerOfMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("now is playing: " + music.getSong());
    }

}
