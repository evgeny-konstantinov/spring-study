package org.example;

public interface Volume {
    void setVolume(int i);

    int getVolume();
}

class VolumeImpl implements Volume {
    private int volume;

    @Override
    public void setVolume(int i) {
        this.volume = i;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
