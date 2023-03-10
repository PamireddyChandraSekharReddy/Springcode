package com.Orginization.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Organization")
public class Organization {
@jakarta.persistence.Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String OrganizationName;
	private String Afiliated;
	private String Address;
	
	public Organization(Long id, String organizationName, String afiliated, String address) {
		super();
		Id = id;
		OrganizationName = organizationName;
		Afiliated = afiliated;
		Address = address;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getOrganizationName() {
		return OrganizationName;
	}

	public void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}

	public String getAfiliated() {
		return Afiliated;
	}

	public void setAfiliated(String afiliated) {
		Afiliated = afiliated;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Organization [Id=" + Id + ", OrganizationName=" + OrganizationName + ", Afiliated=" + Afiliated
				+ ", Address=" + Address + "]";
	}
	
	
	

	
		
}
