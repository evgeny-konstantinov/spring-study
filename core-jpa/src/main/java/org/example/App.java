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
        // create the same table twice to check if the previous transaction was rolled back
        dbService.execute2();

        applicationContext.registerShutdownHook();
        applicationContext.close();
    }
}
