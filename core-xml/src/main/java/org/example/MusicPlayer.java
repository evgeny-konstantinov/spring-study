package org.example;

public class MusicPlayer {
    private Music music;
    private Volume volume;

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
}
