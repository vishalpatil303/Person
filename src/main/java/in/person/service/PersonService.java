package in.person.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import in.person.dto.AddressDto;
import in.person.dto.CityZipCodeDto;
import in.person.model.Person;
import in.person.repository.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	public Person savePerson(Person person) {
		Person p = personRepository.save(person);
		return p;
	}
	public List<Person> findAllPerson(){
		return personRepository.findAll();
	}

	public Map<String,String> findPersonByLastName(String lastName) {
		Map<String,String> cityZipCodeDtos = new HashMap<>();
		
		Set<AddressDto> addressDto = personRepository.findByLastName(lastName);
			for (AddressDto dto : addressDto) {
				cityZipCodeDtos.put(dto.getAddress().getCity(), dto.getAddress().getZipCode());
			}
		return cityZipCodeDtos;
	}
}
