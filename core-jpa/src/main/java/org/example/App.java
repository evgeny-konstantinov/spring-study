package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        DbService dbService = applicationContext.getBean(DbService.class);
        try {
            dbService.execute();
        } catch (Exception e) {
            System.out.println("oops");
        }
        dbService.execute2();

        applicationContext.registerShutdownHook();
        applicationContext.close();
    }
}
