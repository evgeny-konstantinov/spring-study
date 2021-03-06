package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("local");
        //  -Dspring.profiles.active="local"
        applicationContext.register(SpringConfig.class);
        applicationContext.refresh();

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play();
        applicationContext.registerShutdownHook();
        applicationContext.close();
    }
}
