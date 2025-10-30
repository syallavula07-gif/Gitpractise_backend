package com.example.Gitpractise.Service;

import java.util.List;

import com.example.Gitpractise.entity.Employe;


public interface EmployeeService {
	
	Employe saveEmploye(Employe empp);
	
	Employe GetEmployeById(String empId);
	
	Employe updateEmployeById(Employe empp, String empId);
	
	void deleteEmploye(String empId);
	
	List<Employe>getAllEmployes();
	
	

}
