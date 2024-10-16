package in.person.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private Long id;
	    private String firstName;
	    private String lastName;
	 
	    @OneToOne
	    @Cascade(CascadeType.PERSIST)
	    private Address address;

		public Person() {
			
		}

		public Person(String firstName, String lastName, Address address) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
	    
	    
}
