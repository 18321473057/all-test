package org.line.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServe
@SpringBootApplication
public class RegistrationCencelApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationCencelApplication.class, args);
    }
}
