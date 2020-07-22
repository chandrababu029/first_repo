package com.org.employee.controller;

import com.org.employee.model.EmployeeAddress;
import com.org.employee.model.EmployeeDetails;
import com.org.employee.model.EmployeeException;
import com.org.employee.repository.EmpRepo;
import com.org.employee.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/Employee"})
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping("/createEmp")
    public void createEmp(@RequestBody EmployeeDetails employeeDetails) {
        empService.createEmp(employeeDetails);
    }

    @GetMapping("/getEmp")
    public List<EmployeeDetails> getEmp() {
        return (List<EmployeeDetails>) empService.getEmpDetails();
    }

    @GetMapping("/empAddress")
    public List<EmployeeAddress> getAddress() {
        List<EmployeeAddress> address = empService.getEmpAddress();
        return address;
    }

    @GetMapping("/byName/{name}")
    public List<EmployeeDetails> getByName(@PathVariable String name) throws EmployeeException {
        return empService.getByName(name);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id) throws EmployeeException {
        empService.deleteById(id);
    }

}
