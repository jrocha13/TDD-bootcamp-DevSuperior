package com.devsuperior.Task.TDD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.Task.TDD.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
