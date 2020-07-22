package com.org.employee.repository;

import com.org.employee.model.EmployeeDetails;
import jdk.nashorn.internal.objects.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpRepo {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<EmployeeDetails> getByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("eName").is(name));
        return mongoTemplate.find(query, EmployeeDetails.class);
    }
}
