package com.cognizant.country_management.service;

import com.cognizant.country_management.model.Country;
import com.cognizant.country_management.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country getCountryByCode(String code) {
        Optional<Country> optional = countryRepository.findById(code);
        return optional.orElse(null);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(String code, Country updatedCountry) {
        if (countryRepository.existsById(code)) {
            updatedCountry.setCode(code);
            return countryRepository.save(updatedCountry);
        }
        return null;
    }

    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> searchByName(String    name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
}
