package com.system.spring.repos;

import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.system.spring.web.entities.Employees;


@Repository
public interface EmployeeRepository  extends CrudRepository<Employees, Integer> {

}
