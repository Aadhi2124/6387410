package com.cognizant.new_country;

import com.cognizant.new_country.model.Country;
import com.cognizant.new_country.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewCountryApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(NewCountryApplication.class);

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(NewCountryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testAddCountry();
	}

	private void testAddCountry() {
		LOGGER.info("Start");
		Country newCountry = new Country("JP", "Japan");
		countryService.addCountry(newCountry);

		Country retrieved = countryService.findCountryByCode("JP");
		LOGGER.debug("Retrieved Country: {}", retrieved);
		LOGGER.info("End");
	}
}
