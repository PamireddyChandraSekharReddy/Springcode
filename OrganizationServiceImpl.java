package com.Orginization.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Orginization.Entity.Organization;
import com.Orginization.Repository.OrganizationRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements  OrganizationService {
	
	//inject a OrganizationRepository into Service Class And Add ImplementMethod// 
private OrganizationRepository organizationRepository;

	@Override
	public Organization createOrganization(Organization organization) {
		
		return organizationRepository.save(organization);
	}
	//inject a OrganizationRepository into Service Class And Add ImplementMethod// 

	@Override
	public Organization getOrganizationById(Long OrganizationId) {
		Optional<Organization> OptionalOrganization= organizationRepository.findById(OrganizationId);
		return OptionalOrganization.get();
	}
	@Override
	public List<Organization> getAllOrganization() {
		return organizationRepository.findAll();
	}
	@Override
	public Organization updateOrganization(Organization organization) {
		Organization existingOrganization = organizationRepository.findById(organization.getId()).get();
			existingOrganization.setOrganizationName(organization.getOrganizationName());
			existingOrganization.setAfiliated(organization.getAfiliated());
			existingOrganization.setAddress(organization.getAddress());
			Organization updatedOrganization = organizationRepository.save(existingOrganization);
		    return updatedOrganization;
		}
	}
	

