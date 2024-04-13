package com.ooad.ems.repository;
import com.ooad.ems.entity.EmployeeFeedback;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository; 
@Repository
public interface EmployeeFeedbackRepository extends JpaRepository<EmployeeFeedback, Integer> {

}
