package ru.otus.spring.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.spring.service.PersonService;

public class Main {

    public static void main(String[] args) {
        var applicationContext = new ClassPathXmlApplicationContext("/spring-context.xml");

        //сервис берем из контекста
        var personService = applicationContext.getBean(PersonService.class);

        //конкретный person в контексте не лежит
        var person = personService.getByName("Ivan");
        System.out.println("name: " + person.getName() + " age: " + person.getAge());

        applicationContext.close();
    }
}
