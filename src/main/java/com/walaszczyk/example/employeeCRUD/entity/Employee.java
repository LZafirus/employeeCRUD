package com.walaszczyk.example.employeeCRUD.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy="idEmployee", cascade=CascadeType.ALL)
	private ActiveEmployee activeEmployee;
	
	@ManyToMany(fetch=FetchType.LAZY,
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name="team_employee",
			joinColumns=@JoinColumn(name="id_employee"),
			inverseJoinColumns=@JoinColumn(name="id_team")		
			)
	private List<Team> teams;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public Employee() {
		
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public ActiveEmployee getActiveEmployee() {
		return activeEmployee;
	}

	public void setActiveEmployee(ActiveEmployee activeEmployee) {
		this.activeEmployee = activeEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
