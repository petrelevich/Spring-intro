package ru.otus.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring.dao.PersonDao;
import ru.otus.spring.dao.PersonDaoSimple;

//Java-based
@Configuration //говорит, что тут лежит конфигурация
public class DaoConfig {

    @Bean // метод генерирует бин. имя бина совпадает с именем метода
    public PersonDao personDao() {
        return new PersonDaoSimple();
    }

    @Bean // удобно создать несколько бинов из одного класса
    public PersonDao personDaoNext() {
        return new PersonDaoSimple();
    }

    @Bean
    public PersonDao personDaoNextNext() {
        return new PersonDaoSimple();
    }

}
