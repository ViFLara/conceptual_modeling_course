package com.viviane.udemycourse;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.viviane.udemycourse.domain.Category;
import com.viviane.udemycourse.domain.Product;
import com.viviane.udemycourse.repositories.CategoryRepository;
import com.viviane.udemycourse.repositories.ProductRepository;

@SpringBootApplication
public class UdemycourseApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

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

	}
}
