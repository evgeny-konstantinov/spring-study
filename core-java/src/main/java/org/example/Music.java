package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public interface Music {
    String getSong();
}

@Component
@Profile("dev")
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
class RockMusic implements Music {
    @Value("^{rocksong}")
    private String song;

    @Override
    public String getSong() {
        return song;
    }
}

@Component
@Profile("local")
class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Classical";
    }
}
