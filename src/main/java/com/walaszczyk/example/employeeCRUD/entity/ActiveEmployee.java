package com.walaszczyk.example.employeeCRUD.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="active_employee")
public class ActiveEmployee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_employee")
	private Employee idEmployee;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="employee_date")
	@JsonFormat(pattern="yyy-MM-dd:", timezone="Europe/Warsaw")
	private LocalDate employeeDate;
	
	public ActiveEmployee() {

	}
	
	public ActiveEmployee(double salary, LocalDate employeeDate) {
		this.salary = salary;
		this.employeeDate = employeeDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Employee getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Employee idEmployee) {
		this.idEmployee = idEmployee;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getEmployeeDate() {
		return employeeDate;
	}

	public void setEmployeeDate(LocalDate employeeDate) {
		this.employeeDate = employeeDate;
	}

	@Override
	public String toString() {
		return "ActiveEmployee [id=" + id + ", idEmployee=" + idEmployee + ", salary=" + salary + ", employeeDate="
				+ employeeDate + "]";
	}
}
