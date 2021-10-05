package com.viviane.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viviane.udemycourse.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
