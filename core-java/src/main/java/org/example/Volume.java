package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public interface Volume {
    Volume setVolume(int i);

    int getVolume();
}

@Component
class VolumeImpl implements Volume {
    private int volume;

    @Value("50")
    @Override
    public Volume setVolume(int i) {
        this.volume = i;
        return this;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
