package com.walaszczyk.example.employeeCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walaszczyk.example.employeeCRUD.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	
}
