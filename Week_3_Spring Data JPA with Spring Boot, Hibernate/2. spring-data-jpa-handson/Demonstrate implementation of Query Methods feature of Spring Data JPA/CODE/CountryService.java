package com.cognizant.query_method.service;

import com.cognizant.query_method.model.Country;
import com.cognizant.query_method.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> searchByPartialName(String keyword) {
        return countryRepository.findByNameContainingIgnoreCase(keyword);
    }

    public List<Country> searchByPartialNameSorted(String keyword) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc(keyword);
    }

    public List<Country> getCountriesStartingWith(String letter) {
        return countryRepository.findByNameStartingWithIgnoreCase(letter);
    }
}
