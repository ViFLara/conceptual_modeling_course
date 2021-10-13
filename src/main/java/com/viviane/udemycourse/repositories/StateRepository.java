package com.viviane.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viviane.udemycourse.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
