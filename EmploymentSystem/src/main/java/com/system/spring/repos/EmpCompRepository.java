package com.system.spring.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.system.spring.web.entities.EmpComp;

@Repository
public interface EmpCompRepository extends CrudRepository<EmpComp, Long> {

}
