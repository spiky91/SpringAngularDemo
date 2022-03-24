package com.example.springbackend.persistence.repository;

import com.example.springbackend.persistence.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    @Query
    public PersonEntity getAllByName(String name);
}