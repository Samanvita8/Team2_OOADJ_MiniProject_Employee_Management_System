package com.ooad.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.ems.entity.AdminFeedback;

@Repository
public interface AdminFeedbackRepository extends JpaRepository<AdminFeedback, Integer> 
{
	

}
