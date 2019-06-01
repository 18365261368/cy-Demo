package com.cy.demo01.service.impl;

import com.cy.demo01.dao.PersonMap;
import com.cy.demo01.entity.Person;
import com.cy.demo01.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMap personMap;

    @Override
    public List<Person> queryAllPerson() {
        return personMap.findAll();
    }
}
