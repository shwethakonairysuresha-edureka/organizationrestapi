package com.tcs.organizationrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.organizationrestapi.model.Organization;
import com.tcs.organizationrestapi.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {
	
//	private OrganizationServiceImpl()
//	{
//	}
//	
//	private static OrganizationService dao;
//	
//	public static OrganizationService getInstance()
//	{
//		if(dao == null)
//		{
//			dao = new OrganizationServiceImpl();
//			return dao;
//		}
//		return dao;
//	}
	
//	@Autowired
//	private OrganizationDAO organizationDao;
	
	@Autowired
	OrganizationRepository organizationRepository;

	@Override
	public Organization addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organization2 = null;
		try
		{
			organization2 = organizationRepository.save(organization);
			return organization2;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organization2 = null;
		try
		{
			organization2 = organizationRepository.save(organization);
			return "success";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public void deleteOrganization(int id) {
		// TODO Auto-generated method stub
		organizationRepository.deleteById(id);
	}

	@Override
	public Optional<Organization> findById(int id) {
		// TODO Auto-generated method stub
		return organizationRepository.findById(id);
	}

	@Override
	public Optional<List<Organization>> getOrganization() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(organizationRepository.findAll());
	}

	@Override
	public Optional<List<Organization>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organization2 = organizationRepository.save(organization);
	}

}