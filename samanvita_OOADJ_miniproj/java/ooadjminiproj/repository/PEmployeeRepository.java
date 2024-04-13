package net.ooadjminiproj.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.ooadjminiproj.springboot.model.PEmployee;

@Repository
public interface PEmployeeRepository extends JpaRepository<PEmployee, String> {
	PEmployee findByUsername(String username);

	List<PEmployee> findByUsernameStartingWith(String prefix);
	
	
}
