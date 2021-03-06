package com.viviane.udemycourse;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.viviane.udemycourse.domain.Address;
import com.viviane.udemycourse.domain.Category;
import com.viviane.udemycourse.domain.City;
import com.viviane.udemycourse.domain.Custumer;
import com.viviane.udemycourse.domain.Product;
import com.viviane.udemycourse.domain.State;
import com.viviane.udemycourse.domain.enums.CustumerType;
import com.viviane.udemycourse.repositories.AddressRepository;
import com.viviane.udemycourse.repositories.CategoryRepository;
import com.viviane.udemycourse.repositories.CityRepository;
import com.viviane.udemycourse.repositories.CustumerRepository;
import com.viviane.udemycourse.repositories.ProductRepository;
import com.viviane.udemycourse.repositories.StateRepository;

@SpringBootApplication
public class UdemycourseApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CustumerRepository custumerRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(UdemycourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Category cat1 = Category.builder().id(null).name("Computing").build();
		 * Category cat2 = Category.builder().id(null).name("Office").build();
		 * 
		 * Product p1 =
		 * Product.builder().id(null).name("Computing").price(2000.00).build(); Product
		 * p2 = Product.builder().id(null).name("Printer").price(800.00).build();
		 * Product p3 = Product.builder().id(null).name("Mouse").price(80.00).build();
		 */
		
		Category cat1 = new Category(null, "Computing");
		Category cat2 = new Category(null, "Office");
		
		Product p1 = new Product(null, "Computer", 2000.00);
		Product p2 = new Product(null, "Office", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));	
		
		State st1 = new State(null, "Minas Gerais");
		State st2 = new State(null, "S??o Paulo");
		
		City c1 = new City(null, "Uberl??ndia", st1);
		City c2 = new City(null, "S??o Paulo", st2);
		City c3 = new City(null, "Campinas", st2);
		
		st1.getCities().addAll(Arrays.asList(c1));
		st2.getCities().addAll(Arrays.asList(c2, c3));
		
		stateRepository.saveAll(Arrays.asList(st1, st2));
		
		cityRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Custumer cus1 = new Custumer(null, "Maria Silva", "maria@gmail.com", "36378912377", CustumerType.PHYSICALPERSON);
		
		cus1.getPhones().addAll(Arrays.asList("27363323", "93838393"));
		
		Address a1 = new Address(null, "Flowers Street", "300", "Apartment 203", "Garden", "38220834", cus1, c1);
		Address a2 = new Address(null, "Matos Avenue", "105", "Room 203", "Center", "38777012", cus1, c2);
		
		cus1.getAdresses().addAll(Arrays.asList(a1, a2));
		
		custumerRepository.saveAll(Arrays.asList(cus1));
		
		addressRepository.saveAll(Arrays.asList(a1, a2));
		
	}
}
