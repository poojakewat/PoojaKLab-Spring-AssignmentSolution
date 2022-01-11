package com.greatLearning.CollegeFestManagement.service;



import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatLearning.CollegeFestManagement.entity.Students;
import com.greatLearning.CollegeFestManagement.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;



@Service
public class StudentServiceImpl implements StudentService {


	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		List<Students> students=studentRepository.findAll();
		return students;
	}

	@Override
	public Students findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Students thestudent) {
		// TODO Auto-generated method stub
		studentRepository.save(thestudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
		
	}

	@Override
	public List<Students> searchBy(String name, String department) {
		// TODO Auto-generated method stub
		List<Students> students=studentRepository.findByNameContainsAndCountryContainsAllIgnoreCase(name, department);
		return students;
	}





}