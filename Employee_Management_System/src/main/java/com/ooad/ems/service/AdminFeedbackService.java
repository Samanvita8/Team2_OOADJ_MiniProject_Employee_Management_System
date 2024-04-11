package com.ooad.ems.service;
import java.util.*;

import com.ooad.ems.entity.AdminFeedback;

public interface AdminFeedbackService 
{
	List<AdminFeedback> getAllFeedback();
	void deleteFeedbackById(int id);

}
