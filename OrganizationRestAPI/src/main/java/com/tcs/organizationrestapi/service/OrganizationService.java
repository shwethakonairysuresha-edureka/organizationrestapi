package com.tcs.organizationrestapi.service;

import java.util.List;
import java.util.Optional;

import com.tcs.organizationrestapi.model.Organization;

public interface OrganizationService {
	public Organization addOrganization(Organization organization);
	public String updateOrganization(Organization organization);
	public void deleteOrganization(int id);
	public Optional<Organization> findById(int id);
	public Optional<java.util.List<Organization>> getOrganization();
	public Optional<java.util.List<Organization>> findByOrganizationId(int id);
	
	public void registerOrganization(Organization organization);
}