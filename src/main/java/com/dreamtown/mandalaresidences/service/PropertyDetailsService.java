package com.dreamtown.mandalaresidences.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamtown.mandalaresidences.entity.PropertyDetails;
import com.dreamtown.mandalaresidences.entity.PropertyStatus;
import com.dreamtown.mandalaresidences.repository.PropertyDetailsRepository;

@Service
public class PropertyDetailsService {
    @Autowired
    private PropertyDetailsRepository propertyDetailsRepository;

    public Optional<PropertyDetails> getPropertyDetails(Integer id, String tipeProperty) {
        return propertyDetailsRepository.findFirstByIdPropertyAndTipeProperty(id, tipeProperty);
    }

    public List<PropertyDetails> findAllByIdPropertyAndPropertyStatusIsNotOrderByTipePropertyAsc(Integer idProperty) {
        return propertyDetailsRepository.findAllByIdPropertyOrderByTipePropertyAsc(idProperty);
    }
}
