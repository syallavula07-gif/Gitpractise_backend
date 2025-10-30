package com.example.Gitpractise.Service;

import java.util.List;

import com.example.Gitpractise.entity.Employe;


public interface EmployeeService {
	
	Employe saveEmploye(Employe emp);
	
	Employe GetEmployeById(String empId);
	
	Employe updateEmployeById(Employe emp, String empId);
	
	void deleteEmploye(String empId);
	
	
	
	Iterable<Employe>getAllEmployes();
	
	
	
	

}
