package com.ooad.ems.service;

import java.util.List;

import com.ooad.ems.entity.AdminAttendance;

public interface AdminAttendanceService 
{
	List<AdminAttendance> getAllAttendance();
	AdminAttendance getAdminAttendanceById(String id);
	void saveAdminAttendance(AdminAttendance adatt);

}
