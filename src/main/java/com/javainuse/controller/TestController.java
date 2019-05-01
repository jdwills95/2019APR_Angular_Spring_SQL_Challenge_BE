package com.javainuse.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.User;
import com.javainuse.model.Employee;
import com.javainuse.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/employee" })
public class TestController {

	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	public User validateLogin() {
		return new User("User successfully authenticated");
	}

	@Autowired
    EmployeeService employeeService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
                                 
    @RequestMapping(value = "/{employeeId}",  method = RequestMethod.GET)
    public Employee getEmployeebyId(@PathVariable Long employeeId) {
        return employeeService.getEmployeesByID(employeeId);
    }
    
    @RequestMapping(value = "/addemployee", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Employee addNewUser(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }
    
    @RequestMapping(value = "/{employeeId}", method = RequestMethod.PUT)
    public Employee updateEmployee(@PathVariable Long employeeId,  @RequestBody Employee employee) {
    	return employeeService.updateEmployee(employeeId, employee);
    }



	

	}