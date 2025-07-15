package com.cognizant.country_management.controller;

import com.cognizant.country_management.model.Country;
import com.cognizant.country_management.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{co_code}")
    public Country getCountryByCode(@PathVariable("co_code") String code) {
        return countryService.getCountryByCode(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @PutMapping("/{co_code}")
    public Country updateCountry(@PathVariable("co_code") String code, @RequestBody Country country) {
        return countryService.updateCountry(code, country);
    }

    @DeleteMapping("/{co_code}")
    public void deleteCountry(@PathVariable("co_code") String code) {
        countryService.deleteCountry(code);
    }

    @GetMapping("/search")
    public List<Country> searchByName(@RequestParam String name) {
        System.out.println("Searching countries with: " + name);
        return countryService.searchByName(name);
    }
}
