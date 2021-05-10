package com.walaszczyk.example.employeeCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.walaszczyk.example.employeeCRUD.dao.EmployeeDAO;
import com.walaszczyk.example.employeeCRUD.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> result = employeeDAO.findById(id);
		
		Employee employee = null;
		if(result.isPresent()) {
			employee = result.get(); 
		}
		else {
			throw new RuntimeException("Did not find employee id - " + id);
		}
		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeDAO.save(employee);		
	}

	@Override
	public void deleteById(int employeeID) {
		employeeDAO.deleteById(employeeID);		
	}

}
