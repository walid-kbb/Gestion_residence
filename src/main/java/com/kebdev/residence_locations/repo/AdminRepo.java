package com.kebdev.residence_locations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kebdev.residence_locations.model.Admin;

public interface AdminRepo extends JpaRepository<Admin,Long>{
	

}
