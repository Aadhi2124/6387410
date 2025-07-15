package com.cognizant.spring_learn_xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.spring_learn_xml.model.Country;

@SpringBootApplication
public class SpringLearnXmlApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnXmlApplication.class);

	public static void main(String[] args) {
		LOGGER.info("START");
		displayCountry();
		LOGGER.info("END");
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
	}
}
