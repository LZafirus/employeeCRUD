package com.walaszczyk.example.employeeCRUD.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="active_employee")
public class ActiveEmployee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="id_employee")
	private int idEmployee;
	
	@Column(name="salary")
	private double salary;
	
	
	/*	
	 *  Dodać employee date
	 */
	
	//private date employee_date;
	
	@OneToOne(mappedBy="activeEmployee", cascade=CascadeType.ALL)
	private Employee employee;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
