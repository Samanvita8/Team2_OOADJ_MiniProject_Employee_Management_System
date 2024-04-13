package com.ooad.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.ooad.ems.service.EmployeeFeedbackService;
import com.ooad.ems.entity.EmployeeFeedback;
import java.util.Random;
@Controller
public class EmployeeFeedbackController {
	@Autowired
    private EmployeeFeedbackService employeeService;
	@GetMapping("/empviewfeedback")
    public String empviewfeedback(Model model) 
	{
        model.addAttribute("listFeedback", employeeService.getAllFeedback());
        return "empfeedback";
	}
	@GetMapping("/showNewFeedbackForm")
	public String showNewFeedbackForm(Model model)
	{
		EmployeeFeedback employee = new EmployeeFeedback();
		model.addAttribute("feedback", employee);
	    return "add_feedback";
		
	}
	
	@PostMapping("/saveFeedback")
	public String saveFeedback(@ModelAttribute("feedback") EmployeeFeedback employee)
	{
		Random rand = new Random();
		employee.uploaded_by="EMP8564";
		employee.feedbackID=rand.nextInt(1,100000);
		employeeService.saveFeedback(employee);
		return "redirect:/";
	}

}
