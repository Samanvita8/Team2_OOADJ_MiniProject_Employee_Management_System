package com.ooad.ems.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ooad.ems.service.EmployeeAttendanceService;
@Controller
public class EmployeeAttendanceController 
{
	@Autowired
    private EmployeeAttendanceService empattService;
	@GetMapping("/empviewattendance")
	public String adminviewattendance(Model model) 
	{
			
	        model.addAttribute("listAttendance", empattService.getAllAttendance());
	        return "empattendance";
	}

}
