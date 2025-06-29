package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    public static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args){
        String username = "Aadhishwar";
        int loginAttempts = 3;
        boolean success = false;

        logger.info("User '{}' attempted login {} times. Success: {}",username,loginAttempts,success);
    }
}
