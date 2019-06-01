package com.cy.demo01.dao;

import com.cy.demo01.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonMap extends JpaRepository<Person, Long> {
}
