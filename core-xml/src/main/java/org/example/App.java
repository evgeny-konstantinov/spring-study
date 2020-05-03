package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ClassPathXmlApplicationContext applicationContext2 =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = applicationContext2.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);

        musicPlayer.play();
        System.out.println(musicPlayer.getVolume().getVolume());


        applicationContext.close();
        applicationContext2.registerShutdownHook();
    }
}
