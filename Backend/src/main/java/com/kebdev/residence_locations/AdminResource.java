package com.kebdev.residence_locations;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kebdev.residence_locations.model.Admin;
import com.kebdev.residence_locations.service.AdminService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class AdminResource {
	
	private final AdminService adminService;
	
	public AdminResource(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Admin>> getAllAdmins (){
		List<Admin> admins = adminService.getAdmins();
		return new ResponseEntity<>(admins,HttpStatus.OK);
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Admin> getAdmin (@PathVariable("id") Long id ){
		Admin admin = adminService.findAdmin(id);
		return new ResponseEntity<>(admin,HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Admin> addAdmin (@RequestBody Admin admin){
		
		Admin newAdmin = adminService.addAdmin(admin);
		return new ResponseEntity<>(newAdmin,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Admin> updateAdmin (@RequestBody Admin admin){
		
		Admin updateAdmin = adminService.updateAdmin(admin);
		return new ResponseEntity<>(updateAdmin,HttpStatus.OK);
	}
	
	@Transactional
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteAdmin (@PathVariable("id") Long id){
		
		adminService.deleteAdmin(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
