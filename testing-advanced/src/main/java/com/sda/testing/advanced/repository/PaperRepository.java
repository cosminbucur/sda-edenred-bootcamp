package com.sda.testing.advanced.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sda.testing.advanced.model.Paper;

@Repository
public interface PaperRepository extends JpaRepository<Paper, Long> {

    List<Paper> findByAuthor(String author);

    Paper findByTitle(String title);
}
