package com.greglturnquist.payroll.repository;

import com.greglturnquist.payroll.entity.Plant;

import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
    
}
