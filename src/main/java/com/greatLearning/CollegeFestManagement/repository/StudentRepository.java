package com.greatLearning.CollegeFestManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.CollegeFestManagement.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {

	List<Students> findByNameContainsAndCountryContainsAllIgnoreCase(String name,String country);
	
}
