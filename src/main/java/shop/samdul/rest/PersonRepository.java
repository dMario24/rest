package shop.samdul.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="pepole", path="people")
public interface PersonRepository extends 
		PagingAndSortingRepository<Person, Long>,
		CrudRepository<Person, Long> {
	

}
