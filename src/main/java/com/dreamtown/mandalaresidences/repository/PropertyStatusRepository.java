package com.dreamtown.mandalaresidences.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.mandalaresidences.entity.PropertyStatus;

public interface PropertyStatusRepository extends JpaRepository<PropertyStatus, Integer>{
    
}
