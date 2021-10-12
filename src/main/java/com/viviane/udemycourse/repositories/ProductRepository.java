package com.viviane.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viviane.udemycourse.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
