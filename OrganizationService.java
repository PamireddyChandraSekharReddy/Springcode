package com.Orginization.Service;

import java.util.List;

import com.Orginization.Entity.Organization;

public interface OrganizationService {
	
	//create a method to Post Data//
	Organization createOrganization(Organization organization);
	//create a method to GetOrganizationById//
	Organization getOrganizationById(Long OrganizationId);
	//create a method to GetAllId//
    List<Organization> getAllOrganization();
	//create a method to Update data//
    Organization updateOrganization(Organization organization);

    
}


