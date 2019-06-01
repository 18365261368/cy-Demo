package com.cy.demo01.controller;

import com.cy.demo01.entity.Person;
import com.cy.demo01.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping(value = "/getAllPerson", method = RequestMethod.GET)
    public String getAllPerosn(Model model) {
        List<Person> people = personService.queryAllPerson();
        model.addAttribute("person", people);
        return "person/list";
    }

}
