package com.example.employeeRelationship.repositories;

import com.example.employeeRelationship.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
