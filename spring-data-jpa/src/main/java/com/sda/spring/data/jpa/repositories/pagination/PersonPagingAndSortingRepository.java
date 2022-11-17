package com.sda.spring.data.jpa.repositories.pagination;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sda.spring.data.jpa.repositories.Person;

public interface PersonPagingAndSortingRepository extends
        PagingAndSortingRepository<Person, Long> {

    Page<Person> findAllByAge(int age, Pageable pageable);
}
