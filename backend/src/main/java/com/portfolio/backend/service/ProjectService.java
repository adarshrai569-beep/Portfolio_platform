package com.portfolio.backend.service;

import com.portfolio.backend.entity.Project;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project);
    List<Project> getAllProjects();
    Project getProjectById(Long id);
    Project updateProject(Long id, Project project);
    void deleteProject(Long id);
}
