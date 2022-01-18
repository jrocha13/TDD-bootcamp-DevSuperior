package com.devsuperior.Task.TDD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.Task.TDD.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
