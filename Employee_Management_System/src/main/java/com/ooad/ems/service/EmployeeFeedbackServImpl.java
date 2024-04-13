package com.ooad.ems.service;
import java.util.*;
import com.ooad.ems.entity.EmployeeFeedback;
import com.ooad.ems.repository.EmployeeFeedbackRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class EmployeeFeedbackServImpl implements EmployeeFeedbackService
{
	@Autowired
	private EmployeeFeedbackRepository employeeRepository;

	@Override
	public List<EmployeeFeedback> getAllFeedback()
	{
		return employeeRepository.findAll();

	}
	
	@Override
	public void saveFeedback(EmployeeFeedback feedback)
	{
		this.employeeRepository.save(feedback);
	}
}
