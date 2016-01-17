package com.example.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domain.Address;

@RepositoryRestResource(collectionResourceRel="address" , path="address")
public interface AddressRepository extends GraphRepository<Address> {

}
