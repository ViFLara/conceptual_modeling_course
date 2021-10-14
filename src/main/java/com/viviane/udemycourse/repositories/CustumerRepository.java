package com.viviane.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viviane.udemycourse.domain.Custumer;

@Repository
public interface CustumerRepository extends JpaRepository<Custumer, Integer> {

}
