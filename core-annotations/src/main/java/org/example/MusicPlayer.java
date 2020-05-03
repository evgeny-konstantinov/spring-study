package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private Volume volume;

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Playing " + music.getSong());
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Volume getVolume() {
        return volume;
    }

    @Autowired
    public void setVolume(Volume volume) {
        this.volume = volume;
    }
}
