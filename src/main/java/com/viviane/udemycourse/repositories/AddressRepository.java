package com.viviane.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viviane.udemycourse.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
