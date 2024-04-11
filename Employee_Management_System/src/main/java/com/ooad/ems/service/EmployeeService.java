package com.ooad.ems.service;
import com.ooad.ems.entity.Employee;
import java.util.*;
public interface EmployeeService 
{
	List<Employee> getAllFeedback();
	void saveFeedback(Employee feedback);

}
