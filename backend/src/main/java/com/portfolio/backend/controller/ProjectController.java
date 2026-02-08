package com.portfolio.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.portfolio.backend.entity.Project;
import com.portfolio.backend.repository.ProjectRepository;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectRepository repo;

    public ProjectController(ProjectRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Project> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Project save(@RequestBody Project project) {
        return repo.save(project);
    }
}
