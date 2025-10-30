package com.example.Gitpractise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gitpractise.Service.EmployeeService;
import com.example.Gitpractise.entity.Employe;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmploye")
	public ResponseEntity<Employe> SaveEmploye(@RequestBody Employe emp) {
		Employe saved = service.saveEmploye(emp);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Employe> getEmployeById(@PathVariable String empId) {
		Employe get = service.GetEmployeById(empId);
		return new ResponseEntity<>(get, HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Employe> updateEmploye(@PathVariable String empId,
	                                             @RequestBody Employe emp) {
	    Employe updated = service.updateEmployeById(emp, empId);

	    if (updated == null) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	    return new ResponseEntity<>(updated, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmploye(@PathVariable String empId){
		service.deleteEmploye(empId);
        
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Employe>> getAllEmploys() {
		List<Employe> getAll=service.getAllEmployes();
		return new ResponseEntity<>(getAll,HttpStatus.OK);
		
	}
	


	

}
