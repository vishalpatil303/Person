package in.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.person.model.Address;

public interface AddressReposiotry extends JpaRepository<Address, Long> {

}
