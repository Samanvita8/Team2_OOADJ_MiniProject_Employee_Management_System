package com.ooad.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.ooad.ems.service.EmployeeService;
import com.ooad.ems.entity.Employee;
import java.util.Random;
@Controller
public class EmpController {
	@Autowired
    private EmployeeService employeeService;
	@GetMapping("/empviewfeedback")
    public String empviewfeedback(Model model) 
	{
        model.addAttribute("listFeedback", employeeService.getAllFeedback());
        return "index";
	}
	@GetMapping("/showNewFeedbackForm")
	public String showNewFeedbackForm(Model model)
	{
		Employee employee = new Employee();
		model.addAttribute("feedback", employee);
	    return "new";
		
	}
	
	@PostMapping("/saveFeedback")
	public String saveFeedback(@ModelAttribute("feedback") Employee employee)
	{
		Random rand = new Random();
		employee.uploaded_by="EMP8564";
		employee.feedbackID=rand.nextInt(1,100000);
		employeeService.saveFeedback(employee);
		return "redirect:/";
	}

}
