package com.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.entity.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findByTitleContaining(String keyword);

}
