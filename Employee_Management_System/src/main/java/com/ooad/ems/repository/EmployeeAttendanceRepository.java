package com.ooad.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.ems.entity.EmployeeAttendance;

@Repository

public interface EmployeeAttendanceRepository extends JpaRepository<EmployeeAttendance, String> 
{

}
