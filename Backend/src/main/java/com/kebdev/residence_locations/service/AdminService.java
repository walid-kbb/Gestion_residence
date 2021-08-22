package com.kebdev.residence_locations.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kebdev.residence_locations.exception.AdminNotFoundException;
import com.kebdev.residence_locations.model.Admin;
import com.kebdev.residence_locations.repo.AdminRepo;

@Service
public class AdminService {
	
	private final AdminRepo adminRepo;
	
	public AdminService(AdminRepo adminRepo) {
		this.adminRepo = adminRepo;
	}

	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	
	public List<Admin> getAdmins (){
		return adminRepo.findAll();
	}
	
	public Admin updateAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	
	public void deleteAdmin (Long id) {
		adminRepo.deleteAdminById(id);
		
	}
	
	public Admin findAdmin (Long id) {
		return adminRepo.findAdminById(id)
				.orElseThrow(() -> new AdminNotFoundException("fdsf"));
	}
	
}
