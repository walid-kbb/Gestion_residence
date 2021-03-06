package com.kebdev.residence_locations.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kebdev.residence_locations.model.Admin;

public interface AdminRepo extends JpaRepository<Admin,Long>{

	void deleteAdminById(Long id);

	Optional<Admin> findAdminById(Long id);
	

}
