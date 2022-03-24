package com.example.rest;

import com.example.persistence.entity.PersonEntity;
import com.example.persistence.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/person")
public class PersonResource {

    @Inject
    private PersonService personService;


    @GET
    public List<PersonEntity> list() {
        return personService.getAll();
    }


    @POST
    public PersonEntity add(PersonEntity person) {
        return personService.createPerson(person);
    }

}
