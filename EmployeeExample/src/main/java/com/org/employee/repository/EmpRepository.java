package com.org.employee.repository;

import com.org.employee.model.EmployeeDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends MongoRepository<EmployeeDetails, Integer> {


}
