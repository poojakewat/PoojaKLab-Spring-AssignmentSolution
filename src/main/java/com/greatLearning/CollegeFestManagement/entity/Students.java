package com.greatLearning.CollegeFestManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="name")
	private String name;


	@Column(name="department")
	private String department;


	@Column(name="country")
	private String country;


	public Students(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}

	
}











