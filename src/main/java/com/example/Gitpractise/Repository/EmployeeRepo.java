package com.example.Gitpractise.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Gitpractise.entity.Employe;

@Repository
public interface EmployeeRepo extends JpaRepository<Employe, String >{
	
	

}
