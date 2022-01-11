package com.greatLearning.CollegeFestManagement.service;

import java.util.List;

import com.greatLearning.CollegeFestManagement.entity.Students;


public interface StudentService {
	public List<Students> findAll();

	Students findById(int id);

	void save(Students Student);

	void deleteById(int id);

	List<Students> searchBy(String name, String country);

}
