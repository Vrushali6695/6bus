package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.entities.Bus;


public interface BusRepository extends JpaRepository<Bus, Long> {

}
