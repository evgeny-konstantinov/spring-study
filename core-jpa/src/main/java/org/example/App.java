package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        DbService dbService = applicationContext.getBean(DbService.class);
        dbService.persistPerson("Evgeny");
        System.out.println(dbService.getPersons());

        applicationContext.registerShutdownHook();
        applicationContext.close();
    }
}
