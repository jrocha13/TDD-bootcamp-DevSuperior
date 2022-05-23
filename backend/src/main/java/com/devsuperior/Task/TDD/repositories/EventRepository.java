package com.devsuperior.Task.TDD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.Task.TDD.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
