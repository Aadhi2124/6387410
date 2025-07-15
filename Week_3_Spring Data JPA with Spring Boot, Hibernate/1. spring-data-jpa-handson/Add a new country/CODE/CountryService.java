package com.cognizant.new_country.service;

import com.cognizant.new_country.model.Country;
import com.cognizant.new_country.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public Country findCountryByCode(String code) {
        Optional<Country> result = countryRepository.findById(code);
        return result.orElse(null);
    }
}