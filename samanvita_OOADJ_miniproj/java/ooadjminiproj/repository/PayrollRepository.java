package net.ooadjminiproj.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.ooadjminiproj.springboot.model.Payroll;
import net.ooadjminiproj.springboot.model.PayrollId;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, PayrollId> {
    
    Payroll findByUserId(String userId);
    
    List<Payroll> findByUserIdOrderByPayDay(String userId);
    
    List<Payroll> findByUserIdAndPayDay(String userId, String payDay);

	List<Payroll> findByUsername(String username);
	
}
