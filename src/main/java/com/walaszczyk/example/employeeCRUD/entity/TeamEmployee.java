package com.walaszczyk.example.employeeCRUD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name="team_employee")
public class TeamEmployee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="id_employee")	
	private int idEmployee;
	
	@Column(name="id_team")
	private int idTeam;

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

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	@Override
	public String toString() {
		return "TeamEmployee [id=" + id + ", idEmployee=" + idEmployee + ", idTeam=" + idTeam + "]";
	}

	public TeamEmployee(int idEmployee, int idTeam) {
		super();
		this.idEmployee = idEmployee;
		this.idTeam = idTeam;
	}

	public TeamEmployee() {
		super();
	}
	
	
}
