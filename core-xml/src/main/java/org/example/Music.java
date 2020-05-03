package org.example;

public interface Music {
    String getSong();
}

class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
    }
}