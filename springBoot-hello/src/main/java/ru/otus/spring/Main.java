package ru.otus.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.otus.spring.service.PersonService;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(Main.class, args);

        //сервис берем из контекста
        var personService = applicationContext.getBean(PersonService.class);

        //конкретный person в контексте не лежит
        var person = personService.getByName("Ivan");
        System.out.println("name: " + person.getName() + " age: " + person.getAge());

        applicationContext.close();
    }
}
