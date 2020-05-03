package org.example;

public interface Volume {
    int getVolume();

    void setVolume(int i);
}

class VolumeImpl implements Volume {
    private int volume;

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int i) {
        this.volume = i;
    }
}
