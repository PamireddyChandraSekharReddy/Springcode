package com.Orginization.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Orginization.Entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
