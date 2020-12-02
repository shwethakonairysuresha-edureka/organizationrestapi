package com.tcs.organizationrestapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.organizationrestapi.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

	Optional<Organization> findById(int id);
}
