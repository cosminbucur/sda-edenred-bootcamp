package com.sda.spring.data.jpa.repositories.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sda.spring.data.jpa.repositories.Person;

public interface PersonCrudRepository extends CrudRepository<Person, Long> {

    // derived query
    Optional<Person> findByName(String name);   // select * from person where name = :name

}
