package com.dreamtown.mandalaresidences.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.mandalaresidences.entity.ContactPerson;

public interface ContactPersonRepository extends JpaRepository<ContactPerson, Integer>{
    
}
