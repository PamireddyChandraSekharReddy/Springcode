package com.Orginization.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Orginization.Entity.Organization;
import com.Orginization.Service.OrganizationService;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("/Organization")
public class OrganizatioController {
	//inject OrganizationService into controller class//
	
	private OrganizationService organizationService;
	
	//build  Organization RestApi//
@PostMapping	
public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization)	{
	Organization savedOrganization = organizationService.createOrganization(organization);
	return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED) ;
}	
@GetMapping("{Id}")
public ResponseEntity<Organization> getOrganizationById(@PathVariable("Id") Long organizationId){
	Organization organization = organizationService.getOrganizationById(organizationId);
	return new ResponseEntity<>(organization , HttpStatus.OK);	
}
@GetMapping("/Organization/All")
public ResponseEntity<List<Organization>> getAllOrganization(){
	List<Organization>organization =organizationService.getAllOrganization();
	return new ResponseEntity<>(organization,HttpStatus.OK);
	}
public ResponseEntity<Organization> updateOrganization(@PathVariable("Id")Long organizationId,@RequestBody Organization organization){
	Organization updatedorganization = organizationService.updateOrganization(organization);
	return new ResponseEntity<>(updatedorganization,HttpStatus.OK);
	
}
}

