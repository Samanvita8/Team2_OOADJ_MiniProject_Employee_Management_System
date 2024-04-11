package com.ooad.ems.repository;
import com.ooad.ems.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository; 
@Repository
public interface EmployeeInterface extends JpaRepository<Employee, Integer> {

}
