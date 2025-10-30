package com.example.Gitpractise.Serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Gitpractise.Repository.EmployeeRepo;
import com.example.Gitpractise.Service.EmployeeService;
import com.example.Gitpractise.entity.Employe;

@Service
public class EmpServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Employe saveEmploye(Employe emp) {
		
		return repo.save(emp);
	}

	
	@Override
	public Employe GetEmployeById(String empId) {
		
		return repo.findById(empId).orElse(null);
	}

	@Override
	public Employe updateEmployeById(Employe emp, String empId) {
		Employe dbEmp=GetEmployeById(empId);
		// if (dbEmp == null) return null;
		   // dbEmp.setEmployeDetails(emp.get);
		
		return repo.findById(empId).orElse(dbEmp) ;
	}

	@Override
	public void deleteEmploye(String empId) {
		repo.deleteById(empId);
		
	}

	@Override
	public List<Employe> getAllEmployes() {
		
		return repo.findAll();
	}

}
