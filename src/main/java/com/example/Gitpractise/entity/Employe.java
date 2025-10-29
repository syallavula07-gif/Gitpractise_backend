package com.example.Gitpractise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employe {
	
	@Id
	private String empId;
	private String fullName;
	private String email;
	private Long mobileNum;
	private  String location;
	private  Double salary;
	private String gender;
	
	

}
