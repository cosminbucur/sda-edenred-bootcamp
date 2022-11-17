package com.sda.spring.data.jpa.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sda.spring.data.jpa.repositories.Person;

public interface PersonJpaRepository extends JpaRepository<Person, Long> {
}
