package com.example.persistence.service;

import com.example.persistence.entity.PersonEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PersonService {

    @Inject
    EntityManager entityManager;

    @Transactional
    public PersonEntity createPerson(PersonEntity person) {
        entityManager.persist(person);
        return person;
    }

    @Transactional
    public List<PersonEntity> getAll() {
        return entityManager.createNamedQuery("Person.findAll").getResultList();
    }
}
