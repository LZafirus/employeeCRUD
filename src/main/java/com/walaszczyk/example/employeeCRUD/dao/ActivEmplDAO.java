package com.walaszczyk.example.employeeCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.walaszczyk.example.employeeCRUD.entity.ActiveEmployee;

@RepositoryRestResource(path="activeEmployees")
public interface ActivEmplDAO extends JpaRepository<ActiveEmployee, Integer> {

	
}
