package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();
        applicationContext.registerShutdownHook();
        applicationContext.close();
    }
}
