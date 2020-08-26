package ru.otus.spring.spring.dao;

import ru.otus.spring.spring.domain.Person;

public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
