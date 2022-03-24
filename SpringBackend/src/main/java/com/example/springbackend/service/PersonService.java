package com.example.springbackend.service;

import com.example.springbackend.persistence.entity.PersonEntity;
import com.example.springbackend.persistence.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public PersonEntity getById(Long id) {
        return null;
    }

    public void update(PersonEntity resource) {
    }

    public void deleteById(Long id) {
    }

    public PersonEntity create(PersonEntity person) {
        return repository.save(person);
    }

    public List<PersonEntity> findAll() {
        return repository.findAll();
    }
}
