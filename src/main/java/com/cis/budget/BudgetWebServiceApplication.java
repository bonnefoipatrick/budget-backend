package com.cis.budget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author bonne_000
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cis.budget")
public class BudgetWebServiceApplication {

    private static final String RESOURCE_ID = "Budget-WS";

    public static void main(String[] args) {
        SpringApplication.run(BudgetWebServiceApplication.class, args);
    }
}
