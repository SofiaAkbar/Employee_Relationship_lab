package com.example.employeeRelationship.repositories;

import com.example.employeeRelationship.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
