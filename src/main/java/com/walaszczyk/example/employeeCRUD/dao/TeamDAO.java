package com.walaszczyk.example.employeeCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.walaszczyk.example.employeeCRUD.entity.Team;

@RepositoryRestResource(path="teams")
public interface TeamDAO extends JpaRepository<Team, Integer> {

	
}
