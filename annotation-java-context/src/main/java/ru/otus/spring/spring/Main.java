package ru.otus.spring.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.otus.spring.spring.service.PersonService;

@ComponentScan //"ищет" конфигурационные бины начиная с этого места!!!
public class Main {

    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(Main.class);

        //сервис берем из контекста
        var personService = applicationContext.getBean(PersonService.class);

        //конкретный person в контексте не лежит
        var person = personService.getByName("Ivan");
        System.out.println("name: " + person.getName() + " age: " + person.getAge());

        applicationContext.close();
    }
}
