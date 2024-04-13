package net.ooadjminiproj.springboot.service;

import java.util.List;

import net.ooadjminiproj.springboot.model.PEmployee;

public interface PEmployeeService {
	List<PEmployee> getAllPEmployeess();
    PEmployee getEmployeeById(String userId);
	PEmployee getEmployeeByUsername(String username);
	List<PEmployee> findByUsernameStartingWith(String prefix);
	

}

