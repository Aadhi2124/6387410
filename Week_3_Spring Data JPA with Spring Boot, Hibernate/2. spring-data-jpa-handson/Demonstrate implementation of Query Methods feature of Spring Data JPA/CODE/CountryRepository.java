package com.cognizant.query_method.repository;

import com.cognizant.query_method.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Search by text (case-insensitive)
    List<Country> findByNameContainingIgnoreCase(String name);

    // Search by text, sorted ascending by name
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String name);

    // Starts with given letter
    List<Country> findByNameStartingWithIgnoreCase(String prefix);
}