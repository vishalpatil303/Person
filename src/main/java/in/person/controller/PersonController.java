package in.person.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.person.dto.AddressDto;
import in.person.model.Person;
import in.person.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	private final PersonService personService;

	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person entity) {
		entity = personService.savePerson(entity);
		return entity;
	}
	
	@GetMapping("/getAllPerson")
	public List<Person> getAllPerson(){
		return personService.findAllPerson();
	}
	@GetMapping("/getPersonByLastName/{lastName}")
	public Map<String,String> getAllPerson(@PathVariable("lastName") String lastName){
		return personService.findPersonByLastName(lastName);
	}
}
