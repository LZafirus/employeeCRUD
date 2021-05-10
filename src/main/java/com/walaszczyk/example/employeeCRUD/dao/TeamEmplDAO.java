package com.walaszczyk.example.employeeCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.walaszczyk.example.employeeCRUD.entity.Team;
import com.walaszczyk.example.employeeCRUD.entity.TeamEmployee;

@RepositoryRestResource(path="teamEmployees")
public interface TeamEmplDAO extends JpaRepository<TeamEmployee, Integer> {

	
}
