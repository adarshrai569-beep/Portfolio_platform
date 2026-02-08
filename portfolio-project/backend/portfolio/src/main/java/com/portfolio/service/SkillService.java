package com.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.entity.Skill;
import com.portfolio.repository.SkillRepository;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    // CREATE or UPDATE
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    // READ ALL
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    // READ BY ID
    public Skill getSkillById(Long id) {
        return skillRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Skill not found"));
    }

    // DELETE
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
}
