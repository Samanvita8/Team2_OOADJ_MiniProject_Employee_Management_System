package com.ooad.ems.service;
import java.util.*;
import com.ooad.ems.entity.Employee;
import com.ooad.ems.repository.EmployeeInterface;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class EmpServImpl implements EmployeeService
{
	@Autowired
	private EmployeeInterface employeeRepository;

	@Override
	public List<Employee> getAllFeedback()
	{
		return employeeRepository.findAll();

	}
	
	@Override
	public void saveFeedback(Employee feedback)
	{
		this.employeeRepository.save(feedback);
	}
}
