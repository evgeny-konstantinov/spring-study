package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Component
@Service
public class MusicPlayer {
    private Music music;
    @Autowired
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

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    @PreDestroy
    public void dispose() {
        System.out.println(this + " is about to be destroyed");
    }
}
