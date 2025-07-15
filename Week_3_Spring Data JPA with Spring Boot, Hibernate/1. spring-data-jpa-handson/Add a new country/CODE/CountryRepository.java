package com.cognizant.new_country.repository;

import com.cognizant.new_country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}