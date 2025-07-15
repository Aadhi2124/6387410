package com.cognizant.query_method;

import com.cognizant.query_method.model.Country;
import com.cognizant.query_method.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class QueryMethodApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(QueryMethodApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("\n🔍 Countries containing 'ou':");
		List<Country> result1 = countryService.searchByPartialName("ou");
		result1.forEach(c -> System.out.println(c.getCode() + "\t" + c.getName()));

		System.out.println("\n🔍 Countries containing 'ou' sorted:");
		List<Country> result2 = countryService.searchByPartialNameSorted("ou");
		result2.forEach(c -> System.out.println(c.getCode() + "\t" + c.getName()));

		System.out.println("\n🔍 Countries starting with 'Z':");
		List<Country> result3 = countryService.getCountriesStartingWith("Z");
		result3.forEach(c -> System.out.println(c.getCode() + "\t" + c.getName()));
	}
}
