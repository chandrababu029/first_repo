package com.org.employee.service;

import com.org.employee.model.EmployeeAddress;
import com.org.employee.model.EmployeeDetails;
import com.org.employee.model.EmployeeException;
import com.org.employee.repository.EmpRepo;
import com.org.employee.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ControllerAdvice
@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;

    public void createEmp(EmployeeDetails employeeDetails) {
        empRepository.save(employeeDetails);
    }

    public List<EmployeeDetails> getEmpDetails() {
        return empRepository.findAll();
    }

    public List<EmployeeAddress> getEmpAddress() {
        ArrayList<EmployeeAddress> address = new ArrayList<>();
        for (EmployeeDetails employeeDetails : empRepository.findAll()) {
            address.add(employeeDetails.geteAddress());

        }
        return address;
    }

    public Optional<EmployeeDetails> getEmpDetailsById(int eId) {
        return empRepository.findById(eId);
    }

    @Autowired
    EmpRepo empRepo;

    public List<EmployeeDetails> getByName(String name) throws EmployeeException {
        List<EmployeeDetails> employeeDetails= empRepo.getByName(name);
       if (employeeDetails.size()==0){
           throw new EmployeeException("no user with name:"+name);
       }else {
           return employeeDetails;
       }

    }
    public void deleteById(int id) throws EmployeeException {
        Optional<EmployeeDetails> employeeDetails=empRepository.findById(id);
    if (employeeDetails.isPresent()){
        empRepository.deleteById(id);
    }else {
        throw new EmployeeException("no user exists with id:"+id);
    }
    }

}
