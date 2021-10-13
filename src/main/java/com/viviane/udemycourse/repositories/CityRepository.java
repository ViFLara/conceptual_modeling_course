package com.viviane.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viviane.udemycourse.domain.Category;
import com.viviane.udemycourse.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
