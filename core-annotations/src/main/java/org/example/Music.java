package org.example;

import org.springframework.stereotype.Component;

public interface Music {
    String getSong();
}

@Component
class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
    }
}