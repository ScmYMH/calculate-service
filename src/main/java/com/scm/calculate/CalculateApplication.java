package com.scm.calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CalculateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateApplication.class, args);
    }

}
