package com.example.employeeRelationship;

import com.example.employeeRelationship.models.Employee;
import com.example.employeeRelationship.models.Project;
import com.example.employeeRelationship.repositories.EmployeeRepository;
import com.example.employeeRelationship.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeserviceApplicationTests {

//	Employee john;
//	Project rain;

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	ProjectRepository projectRepository;

//	@Before
//	public void before(){
//
//
//	}

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee john = new Employee("John", "Smith", "2079452");
		employeeRepository.save(john);
	}

	@Test
	public void createProject(){}

//	@Test
//	public void testStuff(){
//		Project rain = new Project("Rain", 5);
//		john.addProject(rain);
//		rain.addEmployees(john);
//		projectRepository.save(rain);
//	}

}
