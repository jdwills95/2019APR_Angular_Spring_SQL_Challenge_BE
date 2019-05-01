package com.javainuse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;
import com.javainuse.service.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    
    public List<Employee> getAllEmployees() {
        return this.employeeRepo.findAll();
    }
    
    public Employee getEmployeesByID(Long employeeId) {
    	return employeeRepo.getOne(employeeId);
    }
    
    public Employee addEmployee(Employee employee) {
        return this.employeeRepo.save(employee);
    }
    
	public Employee updateEmployee(Long employeeId, Employee employee) {
		Employee currentEmployee = employeeRepo.getOne(employeeId);
        
        if(currentEmployee == null || employee.getEmpId() != employeeId) {
        	return null;
        }
		
        	return this.employeeRepo.save(employee);
	}
}
