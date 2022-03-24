package com.example.springbackend.controller;

import com.example.springbackend.controller.conditions.RestPreconditions;
import com.example.springbackend.persistence.entity.PersonEntity;
import com.example.springbackend.service.PersonService;
import org.glassfish.jersey.internal.guava.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonEntity> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public PersonEntity findById(@PathVariable("id") Long id) {
        return RestPreconditions.checkNotNull(service.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonEntity create(@RequestBody PersonEntity resource) {
        Preconditions.checkNotNull(resource);
        return service.create(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Long id, @RequestBody PersonEntity resource) {
        Preconditions.checkNotNull(resource);
        RestPreconditions.checkNotNull(service.getById(resource.getId()));
        service.update(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

}
