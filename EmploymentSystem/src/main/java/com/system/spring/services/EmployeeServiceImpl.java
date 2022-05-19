package com.system.spring.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.system.spring.repos.EmployeeRepository;
import com.system.spring.web.entities.Employees;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String addEmployee(Employees employees) {
		
		try {
			employeeRepository.save(employees);
			return "saved";
		} catch(Exception e) {
			return "failed";
		}
	}

/*-----------------outline for if you want to add more implementations ---------------
        // Update a Student
	public String updateStudent(Integer id, Student s) {
		try {
			s.setId(id);
			employeeRepository.save(s);
			return "Updated";
		}catch(Exception e) {
			return "Failed";
		}
	}


	// Get all students
	public Iterable<Student> getAllStudent(){
		return employeeRepository.findAll();
	}

	
	// Get single student by Id
	public Optional<Student> getStudent(Integer id) {
		return employeeRepository.findById(id);
	}

	
	// Delete a Student
	public String deleteStudent(Integer id) {
		try{
			employeeRepository.deleteById(id);
			return "Deleted";
		} catch(Exception e) {
			return "Failed";
		} 
	}

	
} */
}
