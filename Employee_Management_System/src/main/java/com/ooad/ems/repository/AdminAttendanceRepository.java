package com.ooad.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.ems.entity.AdminAttendance;

@Repository
public interface AdminAttendanceRepository extends JpaRepository<AdminAttendance, String> 
{

}
