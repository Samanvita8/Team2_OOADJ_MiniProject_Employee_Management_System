package com.ooad.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.ooad.ems.service.AdminFeedbackService;


@Controller
public class AdminFeedbackController 
{
	@Autowired
    private AdminFeedbackService adfeedService;
	
	@GetMapping("/adminviewfeedback")
	 public String adminviewfeedback(Model model) 
		{
			
	        model.addAttribute("listFeedback", adfeedService.getAllFeedback());
	        return "adminfeedback";
		}
	@GetMapping("/deleteFeedback/{id}")
	public String deleteEmployee(@PathVariable (value = "id") int id) {
		
	 // call delete employee method 
	 this.adfeedService.deleteFeedbackById(id);
	 return "redirect:/";
	}

}
