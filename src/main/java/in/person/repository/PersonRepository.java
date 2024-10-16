package in.person.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.person.dto.AddressDto;
import in.person.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{
	
	//List<Person> findByLastName(String lastName);
	//@Query("Select p from Person p where p.lastName = :?")
	Set<AddressDto> findByLastName(String lastName);

}
