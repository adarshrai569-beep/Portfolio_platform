package com.portfolio.backend.service;

import com.portfolio.backend.entity.Project;
import com.portfolio.backend.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + id));
    }

    @Override
    public Project updateProject(Long id, Project project) {
        Project existing = getProjectById(id);

        existing.setTitle(project.getTitle());
        existing.setDescription(project.getDescription());
        existing.setTechStack(project.getTechStack());
        existing.setGithubLink(project.getGithubLink());
        existing.setLiveLink(project.getLiveLink());
        existing.setImageUrl(project.getImageUrl());

        return projectRepository.save(existing);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
