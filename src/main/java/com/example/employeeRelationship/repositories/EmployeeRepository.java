package com.example.employeeRelationship.repositories;

import com.example.employeeRelationship.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
