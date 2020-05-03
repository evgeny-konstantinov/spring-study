package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public interface Volume {
    int getVolume();

    void setVolume(int i);
}

@Component
class VolumeImpl implements Volume {
    private int volume;

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Value("50")
    @Override
    public void setVolume(int i) {
        this.volume = i;
    }
}
