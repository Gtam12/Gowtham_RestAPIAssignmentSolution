package com.greatlearning.employee.entity;


import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="Employee")
@Data
public class Employee {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	
	
	
}