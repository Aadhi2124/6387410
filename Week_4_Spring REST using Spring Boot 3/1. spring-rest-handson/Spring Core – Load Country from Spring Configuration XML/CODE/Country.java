package com.cognizant.spring_learn_xml.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String co_code;
    private String co_name;

    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    public String getCo_code() {
        LOGGER.debug("Inside getCo_code()");
        return co_code;
    }

    public void setCo_code(String co_code) {
        LOGGER.debug("Inside setCo_code()");
        this.co_code = co_code;
    }

    public String getCo_name() {
        LOGGER.debug("Inside getCo_name()");
        return co_name;
    }

    public void setCo_name(String co_name) {
        LOGGER.debug("Inside setCo_name()");
        this.co_name = co_name;
    }

    @Override
    public String toString() {
        return "Country [co_code=" + co_code + ", co_name=" + co_name + "]";
    }
}
