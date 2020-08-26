package ru.otus.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.otus.spring.dao.PersonDao;
import ru.otus.spring.domain.Person;

@Service //конфигурация аннртациями
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    /*
        Правильный вариант - внедрение через конструктор
        @Autowired следует избегать
    */
    //Qualifier можно уточнить, какой именно бин надо внедрить
    public PersonServiceImpl(@Qualifier("personDaoNext") PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
