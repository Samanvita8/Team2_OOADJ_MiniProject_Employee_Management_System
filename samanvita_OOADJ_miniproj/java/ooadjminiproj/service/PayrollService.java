
package net.ooadjminiproj.springboot.service;

import java.util.List;

import net.ooadjminiproj.springboot.model.Payroll;

public interface PayrollService {
    
    List<Payroll> getAllEmployees();
    void saveEmployee(Payroll employee);	
	List<Payroll> getEmployeeById(String userId, String payDay);
	List<Payroll> getPayrollByUsername(String username);
	
	
	
}
