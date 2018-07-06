package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.SuperMarket;

@RepositoryRestResource(collectionResourceRel ="supermarket" , path ="supermarket")
public interface SuperMarketRepository extends JpaRepository<SuperMarket, Integer> {

	/*
	 * @RepositoryRestResource(collectionResourceRel ="aliens" , path ="alien")
	 * Using above annotation , we actually don't need the Controller class.
	 * All the CRUD operation will be managed by itself.
	 * CRUD operations is defined under JpaRepository Interface.
	 * 
	 * collectionResourceRel ="aliens"  All the functions will map URL according 
	 * to "aliens" ie GET, POST, DELETE ,PUT will use URL "aliens"
	 * 
	 * Above is the magic of Spring Data Rest.
	 *
	 */
}
