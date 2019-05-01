package com.javainuse.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>  {

}
