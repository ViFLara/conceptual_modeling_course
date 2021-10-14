package com.viviane.udemycourse.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viviane.udemycourse.domain.Custumer;
import com.viviane.udemycourse.repositories.CustumerRepository;
import com.viviane.udemycourse.services.exceptions.ObjectNotFoundException;

@Service
public class CustumerService {
	
	@Autowired
	private CustumerRepository repository;
	
	public Custumer find(Integer id) { 
		 Optional<Custumer> obj = repository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Object not found! Id: " + id + ", Type: " + Custumer.class.getName())); 
		} 
}
