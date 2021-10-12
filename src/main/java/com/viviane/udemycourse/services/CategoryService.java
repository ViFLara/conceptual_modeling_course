package com.viviane.udemycourse.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viviane.udemycourse.domain.Category;
import com.viviane.udemycourse.repositories.CategoryRepository;
import com.viviane.udemycourse.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category find(Integer id) { 
		 Optional<Category> obj = repository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Object not found! Id: " + id + ", Type: " + Category.class.getName())); 
		} 
}
