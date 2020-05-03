package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();
        System.out.println(musicPlayer.getVolume());

        Moveable moveable = applicationContext.getBean(Moveable.class);
        System.out.println(moveable);

        applicationContext.registerShutdownHook();
        applicationContext.close();
    }
}
