package com.ooad.ems.service;
import com.ooad.ems.entity.EmployeeFeedback;
import java.util.*;
public interface EmployeeFeedbackService 
{
	List<EmployeeFeedback> getAllFeedback();
	void saveFeedback(EmployeeFeedback feedback);

}
