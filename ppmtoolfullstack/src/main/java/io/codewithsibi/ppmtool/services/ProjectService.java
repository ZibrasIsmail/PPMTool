package io.codewithsibi.ppmtool.services;

import io.codewithsibi.ppmtool.domain.Project;
import io.codewithsibi.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Logic

    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);
    }
}
